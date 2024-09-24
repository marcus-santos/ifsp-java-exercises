import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        /*Crie  uma  classe  Java  para  funcionários.  Ele  deve  ter  o  nome  do  funcionário,  o 
        departamento onde trabalha, seu salário (double), a data de entrada na empresa 
        (String) e seu RG (String). 
        
        • Você  deve  criar  alguns  métodos  de  acordo  conforme  sua  necessidade. 
        Além deles, crie um método recebeAumento que aumenta o salário do 
        funcionário de acordo com o parâmetro passado como argumento. Crie 
        também  um  método  calculaGanhoAnual,  que  não  recebe  parâmetro 
        algum, devolvendo o valor do salário multiplicado por 12. 
        • Teste esta classe, usando uma outra classe que contenha o método main. 
        Você  deve  criar  a  classe  do  funcionário  com  o  nome  Funcionario,  mas 
        pode nomear como quiser a classe de testes, contudo, ela deve possuir o 
        método main. */

        Funcionario programador = new Funcionario();

        programador.setNome(JOptionPane.showInputDialog("Insira o seu nome"));
        programador.setDepartamento(JOptionPane.showInputDialog("Insira o seu Departamento"));
        programador.setRg(JOptionPane.showInputDialog("Insira o seu RG"));
        programador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o seu Salario")));
        programador.setDataEntrada(JOptionPane.showInputDialog("Insira a sua Data de Entrada na Empresa"));
        programador.setAumento(Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor do aumento: ")));
        programador.recebeAumento(programador.getSalario(),programador.getAumento());
        JOptionPane.showMessageDialog(null, "Salário Atualizado: " + programador.getSalario() + "\nGanho Anual: " + programador.calculaGanhoAnual(programador.getSalario()));

    }
}
