import javax.swing.JOptionPane;

public class App {

    /* Criar as funções recebendo dois parâmetros e com retorno:  
    float adicao(float, float) - calcula a soma de dois números 
    float subtracao(float, float) - calcula a subtração de dois números 
    float multiplicacao(float, float) - calcula o produto de dois números 
    float divisao(float, float) - calcula a divisão de dois números 
    O usuário irá entrar com dois números inteiros ou reais. A função main() deve efetuar a 
    chamada das funções e receber como retorno o resultado. 
    Requisitos:  
    a. Utilizar as funções para retornar o resultado. Apesar desta questão permitir realizar 
    a apresentação dos resultados diretamente pela função main(), exclusivamente por 
    cunho  didático,  devem  ser  realizadas  as  chamadas  das  funções  e  estes  devem 
    retornar um argumento; 
    b. Apresentar os valores com uma casa decimal.*/

    public static float adicao(float n1, float n2){
        float result = n1 + n2;
        return result;
    }

    public static float subtracao(float n1, float n2){
        float result = n1 - n2;
        return result;
    }

    public static  float divisao(float n1, float n2){
        float result = n1 / n2;
        return result;
    }

    public static float multiplicacao(float n1, float n2){
        float result = n1 * n2;
        return result;
    }


    public static void main(String[] args) throws Exception {
    
    float n1, n2;

    n1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o primeiro valor: "));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o segundo valor: "));

    JOptionPane.showMessageDialog(null, adicao(n1,n2));
    JOptionPane.showMessageDialog(null, subtracao(n1,n2));
    JOptionPane.showMessageDialog(null, multiplicacao(n1,n2));
    JOptionPane.showMessageDialog(null, divisao(n1,n2));


    }
}
