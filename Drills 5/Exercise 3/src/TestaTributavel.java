public class TestaTributavel {
    public static void main(String[] args) {
        
        ContaCorrente itau =  new ContaCorrente();
        ContaPoupanca caixa = new ContaPoupanca();
        SeguroDeVida bb = new SeguroDeVida();

        
        System.out.println(bb.calculaTributos());
        
    }
}
