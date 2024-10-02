public class ProdutoFinal implements IProdutoFabricado{

    String nome;
    float custo;

    @Override
    public IProduto getIngrediente(int numero) {
        
        return null;
    }

    @Override
    public int getNumeroIngredientes() {
        
        return 0;
    }

    @Override
    public float getCusto() {
        return this.custo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
    
}
