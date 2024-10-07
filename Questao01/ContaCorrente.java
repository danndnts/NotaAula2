public class ContaCorrente extends Pessoa {
    private int numeroConta;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void chequeEspecial() {
        System.out.println("O cheque especial é de R$ 1.000,00");
    }
}

