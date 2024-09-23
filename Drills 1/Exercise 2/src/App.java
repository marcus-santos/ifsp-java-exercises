import java.util.Scanner;

public class App {

public static void main(String[] args) {
    
    /*Faça um programa na linguagem Java que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e 
o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)  */

    int year , month, day;
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite quantos anos, meses e dias respectivamente: ");
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();
    }
    
    year = year*365;
    month = month*30;
    
    System.out.println("Idade em dias: " + (day + month + year));
}
}