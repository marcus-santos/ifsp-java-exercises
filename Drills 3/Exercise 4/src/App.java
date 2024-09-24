import java.time.LocalDate;
import javax.swing.JOptionPane;

public class App {

    /*Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe 
    deverá: 
    
    a) Representar uma data usando três atributos: o dia, o mês, e o ano. 
    b) Ter  um  construtor  que  inicializa  os  três  atributos  e  verifica  a  validade  dos 
    valores fornecidos. 
    c) Fornecer  um  construtor  sem  parâmetros  que  inicializa  a  data  com  a  data 
    atual fornecida pelo sistema operacional. 
    d) Fornecer um método set e um get para cada atributo. 
    e) Fornecer o método toString para retornar uma representação da data como 
    String. Considere que a data deve ser formatada mostrando o dia, o mês e o 
    ano separados por barra (/). 
    f) Fornecer uma operação para avançar uma data para o dia seguinte. 
    g) Fornecer  um  método  para  comparar  duas  datas  e  retorne:  0,  se  as  datas 
    forem iguais; 1, se o primeiro parâmetro for maior que o segundo;  -1, se o 
    segundo parâmetro for maior que o primeiro. 
    h) Fornecer uma operação para verificar se um ano é ou não bissexto. 
    Escreva um aplicativo de teste que demonstra as capacidades da classe  */


    public static void main(String[] args) throws Exception {

        LocalDate data1 = LocalDate.of(2023, 5, 13);
        LocalDate data2 = LocalDate.of(2023, 5, 13);
        
        Data calendar = new Data();
        calendar.realTimeDate();
        calendar.setDia(28);
        calendar.setMes(2);
        calendar.setAno(2024);
        calendar.somaData();
        
        JOptionPane.showMessageDialog(null, calendar.toString());
        JOptionPane.showMessageDialog(null, calendar.compareDate(data1, data2));
        JOptionPane.showMessageDialog(null, calendar.verBissexto(2024));
        
    }
}
