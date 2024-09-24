import javax.swing.JOptionPane;

public class App {

    
    public static void main(String[] args) throws Exception {
    
    /*Grande parte dos programas de computador trabalham com data, que deve ser validada 
    para que o usuário não coloque datas que não existam como 31/04/2008, 12/14/2009 
    ou  43/05/2000.  Faça  um  programa  em  Java  para  imprimir  se  a  data  é  válida  ou  não. 
    Considerar também a ocorrência de anos bissextos, sabendo que: um ano é bissexto se 
    for divisível por 400, ou por 4 e não o for por 100.  */    

    int day, month, year;

    day = Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia: "));
    month = Integer.parseInt(JOptionPane.showInputDialog("Entre com o mês: "));
    year = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano: "));

    
    if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10 || month == 12){
        if(day > 0 && day <= 31){
            JOptionPane.showMessageDialog(null, "Data: "+ day + "/" + month + "/" + year +" é valida.");
        }
        else JOptionPane.showMessageDialog(null, "Data Inválida.");
    }
    else if(month == 2){
        if( ( year % 4) == 0 && (year % 100) != 0){
            if(day > 0 && day <= 29){
                JOptionPane.showMessageDialog(null, "Data: "+ day + "/" + month + "/" + year +" é valida.");
            }
            else JOptionPane.showMessageDialog(null, "Data Inválida.");
        }
        else{
            if(day > 0 && day <= 28){
                JOptionPane.showMessageDialog(null, "Data: "+ day + "/" + month + "/" + year +" é valida.");
            }
            else JOptionPane.showMessageDialog(null, "Data Inválida.");
        }
    }
    else{
        if(day > 0 && day <= 30){
            JOptionPane.showMessageDialog(null, "Data: "+ day + "/" + month + "/" + year +" é valida.");
        }
        else JOptionPane.showMessageDialog(null, "Data Inválida.");
    }
}
}