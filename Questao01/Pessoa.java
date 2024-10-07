public class Pessoa {

    protected String nome;
    protected String cpf;
    protected double valor;
    protected double saldo;



    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar() {
        if (valor > 0) {
            saldo += valor;
            System.out.println("O saldo é de: "+ saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar() {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("O saldo é de: "+ saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar");
        }
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("saldo: " + saldo);
    }




}
