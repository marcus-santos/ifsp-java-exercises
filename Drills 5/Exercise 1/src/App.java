import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int choice; 
        Scanner sc = new Scanner(System.in);
        Cientifica calCientifica = new Cientifica();

        System.out.println("Bem Vindo a Calculadora!\nEscolha a Operação:\n0: Adição\t\t1:Subtração\n2: Multiplicação\t3:Divisão\n4: Potenciação\t\t5: Radiciação");
        choice = sc.nextInt();

        if(choice == 0){
            System.out.println("Você Escolheu Soma!\nDigite o primeiro numero: ");
            calCientifica.setNumber1(sc.nextDouble());

            System.out.println("Digite o segundo numero: ");
            calCientifica.setNumber2(sc.nextDouble());

            System.out.println("Resultado: " + calCientifica.soma(calCientifica.getNumber1(), calCientifica.getNumber2()));
        }

        if(choice == 1){
            System.out.println("Você Escolheu Subtração!\nDigite o primeiro numero: ");
            calCientifica.setNumber1(sc.nextDouble());

            System.out.println("Digite o segundo numero: ");
            calCientifica.setNumber2(sc.nextDouble());

            System.out.println("Resultado: " + calCientifica.subtracao(calCientifica.getNumber1(), calCientifica.getNumber2()));
        }

        if(choice == 2){
            System.out.println("Você Escolheu Multplicação!\nDigite o primeiro numero: ");
            calCientifica.setNumber1(sc.nextDouble());

            System.out.println("Digite o segundo numero: ");
            calCientifica.setNumber2(sc.nextDouble());

            System.out.println("Resultado: " + calCientifica.multiplicacao(calCientifica.getNumber1(), calCientifica.getNumber2()));
        }

        if(choice == 3){
            System.out.println("Você Escolheu Divisão!\nDigite o primeiro numero: ");
            calCientifica.setNumber1(sc.nextDouble());

            System.out.println("Digite o segundo numero: ");
            calCientifica.setNumber2(sc.nextDouble());

            System.out.println("Resultado: " + calCientifica.divisao(calCientifica.getNumber1(), calCientifica.getNumber2()));
        }

        if(choice == 4){
            System.out.println("Você Escolheu Potenciação!\nDigite o primeiro numero: ");
            calCientifica.setNumber1(sc.nextDouble());

            System.out.println("Digite o segundo numero: ");
            calCientifica.setNumber2(sc.nextDouble());

            System.out.println("Resultado: " + calCientifica.exponenciacao(calCientifica.getNumber1(), calCientifica.getNumber2()));
        }

        if(choice == 5){
            System.out.println("Você Escolheu Radiciação!\nDigite o primeiro numero: ");
            calCientifica.setNumber1(sc.nextDouble());

            System.out.println("Resultado: " + calCientifica.raiz(calCientifica.getNumber1()));
        }
    }
}
