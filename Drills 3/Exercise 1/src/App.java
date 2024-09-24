import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) throws Exception {

    /* Escreva  uma  classe  cujos  objetos  representam  alunos  matriculados  em  uma 
    disciplina. Cada objeto dessa classe deve guardar os seguintes dados do aluno: 
    matrícula,  nome,  2  notas  de  prova  e  1  nota  de  trabalho.  Escreva  os  seguintes 
    métodos para esta classe: 

        a) media:  calcula  a  média  do  aluno,  sabendo  que  cada  prova  tem  2.5  e  o 
        trabalho tem peso 2. 
        b) rec: calcula qual a nota o aluno precisa obter na prova de recuperação para 
        ser aprovado, caso não tenha atingido média 6.0. Sabe-se que o aluno deve 
        ser aprovado com média final 6.0 e a média final é calculada como a média 
        aritmética simples entre a média e a recuperação. */

        aluno marcus = new aluno();

        marcus.setNome(JOptionPane.showInputDialog("Insira o seu nome: "));
        marcus.setMatricula(JOptionPane.showInputDialog("Insira a sua Matricula: "));
        marcus.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Insira a sua primeira nota: ")));
        marcus.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Insira a sua segunda nota: ")));
        marcus.setTrabalho(Integer.parseInt(JOptionPane.showInputDialog("Insira a sua nota de trabalho: ")));

        JOptionPane.showMessageDialog(null, "Nome: " + marcus.getNome() + "\nMatricula: " + marcus.getMatricula() + "\n1° Nota: " + marcus.getNota1() + "\n2° Nota : " + marcus.getNota2() + "\nTrabalho: " + marcus.getTrabalho());
        JOptionPane.showMessageDialog(null, marcus.calcMedia());

    }
}
