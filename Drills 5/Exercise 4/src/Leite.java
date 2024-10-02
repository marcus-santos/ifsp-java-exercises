public class Leite extends Produto {
    int vencimento;

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public Leite(String nome, double preco, int vencimento) {
        super(nome, preco);
        this.vencimento = vencimento;
    }

    @Override
    public int compareTo(Produto o) {
        switch(o){
            case Leite l:
                if(this.getPreco()/this.getVencimento() < (l.getPreco()/l.getVencimento())){
                return 1;
                }
                else if(this.getPreco()/this.getVencimento() > (l.getPreco()/l.getVencimento())){
                    return -1;
                }
                break;

                default:break;
        }
        return 0;
    }
}
