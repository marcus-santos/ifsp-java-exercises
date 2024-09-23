import javax.swing.JOptionPane;

public class App {

    /*O dia da semana para uma data qualquer pode ser calculado pela seguinte fórmula:  
    DIA  DA  SEMANA  =  RESTO  ((TRUNCA(2,6  *  M  –  0,1)  +  D  +  A  +  QUOCIENTE(A,  4)  + 
    QUOCIENTE(S, 4) – 2 * S), 7)  
    Onde:  
    M  –  representa  o  número  do  mês.  Janeiro  e  fevereiro  são  os  meses  11  e  12  do  ano 
    precedente, março é o mês 1 e dezembro é o mês 10; 
    D – representa o dia do mês; 
    A – representa o número formado pelos dois últimos algarismos do ano; 
    S – representa o número formado pelos dois primeiros algarismos do ano.  
    Os dias da semana são numerados de zero a seis (domingo corresponde a 0, segunda a 
    1, e assim por diante).  
    Fazer um programa na Linguagem Java que: determine o dia da semana correspondente 
    a data lida, segundo o método especificado, onde: RESTO, TRUNCA e QUOCIENTE  são 
    funções a serem programadas. Ao final o programa deverá escrever a data lida e o dia 
    da semana calculado. */

    public static int resto(int trunca, int d, int a, int q1, int q2, int s){
        int resto = ((trunca + d + a + q1 + q2 - 2 * s) % 7)+ 1;
        return resto;
    }

    public static int trunca(int m){
        int trunca =  (23 * m - 1);
        return trunca;
    }

    public static int quociente(int x){
        int quociente = x/4;
        return quociente;
    }

    public static void main(String[] args) throws Exception {
        
        int day, month, aa, ss;

        day = Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Entre com o mês: "));
        aa = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano: "));

        ss = aa / 100;
        aa = aa % 100;

        if(month == 1 || month  == 2){
            month = month + 10;
        }
        else month = month - 2;

        JOptionPane.showMessageDialog(null, "O dia da semana é: " + resto(trunca(month), day, aa, quociente(aa), quociente(ss), ss));

    }
}