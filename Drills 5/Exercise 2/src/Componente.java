public class Componente implements IProduto{

    String nome;
    float custo;
    int numero;

    @Override
    public float getCusto() {
        return this.custo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    
    
}
