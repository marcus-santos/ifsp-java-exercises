import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Data {
    private int dia;
    private int mes;
    private int ano;



    public boolean verBissexto(int ano){
        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            return true;
        }
        else{
            return false;
        }
    }

    public int compareDate(LocalDate data1, LocalDate data2){
        int res = 3;
        if(data1.isEqual(data2)) res = 0;
        else if(data1.isBefore(data2)) res = 1;
        else if(data1.isAfter(data2)) res = -1;

        return res;
    }

    public void somaData(){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia > 0 && dia <= 30){
                dia++;
            }
            else{
                if(mes == 12){
                    ano++;
                    mes = 1;
                    dia = 1;
                }
                else{
                    mes++;
                    dia = 1;
                }
            }
        }
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if(dia > 0 && dia <= 28){
                dia++;
            }
            else{
                mes++;
                dia = 1;
            }
        }
        else{
            if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
                if(dia > 0 && dia <= 28){
                    dia ++;
                }
            }
            else{
                mes++;
                dia = 1;
            }
        }
    }

    public String toString(){
        String stringDate = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);
        return stringDate;
    }

    public void realTimeDate(){

        LocalDateTime now = LocalDateTime.now(); 

        dia = now.getDayOfMonth();
        mes = now.getMonthValue();
        ano = now.getYear();

    }

    public void validate(int dia, int mes, int ano){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia > 0 && dia <= 31){
                JOptionPane.showMessageDialog(null,"Data Válida.");
            }
            else JOptionPane.showMessageDialog(null, "Data Inválida.");
        }

        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if(dia > 0 && dia <= 30){
                JOptionPane.showMessageDialog(null, "Data Válida.");
            }
            else JOptionPane.showMessageDialog(null, "Data Inválida.");
        }

        if(mes == 2){
            if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
                if(dia > 0 && dia <= 29){
                    JOptionPane.showMessageDialog(null, "Data Válida.");
                }
                else JOptionPane.showMessageDialog(null, "Data Inválida.");
            }
            else{
                if(dia > 0 && dia <= 28){
                    JOptionPane.showMessageDialog(null, "Data Válida.");
                }
                else JOptionPane.showMessageDialog(null, "Data Inválida.");
            }
        }

        else if(mes < 0 || mes > 12){
            JOptionPane.showMessageDialog(null, "Data Inválida.");
        }
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
