public class Shampoo extends Produto{
    int irritabilidade;

    public int getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }

    public Shampoo(String nome, double preco, int irritabilidade) {
        super(nome, preco);
        this.irritabilidade = irritabilidade;
    }

    @Override
    public int compareTo(Produto o) {
        switch(o){
            case Shampoo s:
                if(this.getPreco()/this.getIrritabilidade() < (s.getPreco()/s.getIrritabilidade())){
                return 1;
                }
                else if(this.getPreco()/this.getIrritabilidade() > (s.getPreco()/s.getIrritabilidade())){
                    return -1;
                }
                break;

                default:break;
        }
        return 0;
    }
    
}
