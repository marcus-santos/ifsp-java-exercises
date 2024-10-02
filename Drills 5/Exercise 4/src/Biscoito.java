public class Biscoito extends Produto {
    int cancer;

    public int getCancer() {
        return cancer;
    }

    public void setCancer(int cancer) {
        this.cancer = cancer;
    }

    public Biscoito(String nome, double preco, int cancer) {
        super(nome, preco);
        this.cancer = cancer;
    }

    @Override
    public int compareTo(Produto o) {
        switch (o) {
            case Biscoito b:
                if (this.getPreco() / this.getCancer() < (b.getPreco() / b.getCancer())) {
                    return 1;
                } else if (this.getPreco() / this.getCancer() > (b.getPreco() / b.getCancer())) {
                    return -1;
                }
                break;

            default:
                break;
        }
        return 0;
    }
}
