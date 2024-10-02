public class SeguroDeVida implements Tributavel{

    double saldo = 500;

    @Override
    public double calculaTributos() {
        return saldo = saldo -= 42;
    }    

}
