public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String rg;
    String dataEntrada;
    Double aumento;

    

    public double recebeAumento(double salario, double aumento){
        this.salario = salario + aumento;
        return salario;
    }

    public double calculaGanhoAnual(double salario){
        double ganhoAnual = salario *12;
        return ganhoAnual;  
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getDataEntrada() {
        return dataEntrada;
    }
    
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Double getAumento() {
        return aumento;
    }

    public void setAumento(Double aumento) {
        this.aumento = aumento;
    }

}
