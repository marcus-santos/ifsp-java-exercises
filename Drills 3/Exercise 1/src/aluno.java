import javax.swing.JOptionPane;

public class aluno {
    private String matricula;
    private String nome;
    private int nota1;
    private int nota2;
    private int trabalho;
    private float media;
    private float rec;

    public float calcMedia(){
         this.media = ((this.nota1 * 2.5f) + (this.nota2 * 2.5f) + (this.trabalho *2)) /7;
         if(media < 6){
            calculaRec(media);
         }

         return media;
    }

    public void calculaRec(float media){
        float rec = (12 - media);
        JOptionPane.showMessageDialog(null, "Sua Média foi "+ media +"\nVocê foi Reprovado, é necessário tirar " + rec + " na Recuperação para passar.");
        setRec();
    }


    public void notaFinal(float media, float rec){
        this.media = (media + rec)/2;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(int trabalho) {
        this.trabalho = trabalho;
    }

    public void setRec(){
        this.rec = Float.parseFloat(JOptionPane.showInputDialog("Nota da Recuperação: "));
        notaFinal(media, rec);
    }

    public float getRec(){
        return rec;
    }
}


