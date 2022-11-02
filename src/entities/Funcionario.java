package entities;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salarioBase;
    private int qtdDias;

    public static int qtdDiasMes = 30;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public double salarioPorporcional(int qtdDias){
        return getSalarioBase()*qtdDias/qtdDiasMes;
    }

    public String toString(){
        return "Nome: " + getNome() + " CPF: " + getCpf() + " Salário Base: " + getSalarioBase();
    }

    @Override

    public int hashCode(){
        return Integer.parseInt(getCpf());
    }

}
