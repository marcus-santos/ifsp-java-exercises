public abstract class Calculadora {
    private double number1;
    private double number2;

    public double soma(double number1, double number2){
        return number1 + number2;
    }

    public double subtracao(double number1, double number2){
        return number1 - number2;
    }

    public double multiplicacao(double number1, double number2){
        return number1 * number2;
    }

    public double divisao(double number1, double number2){
        return number1 / number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

}
