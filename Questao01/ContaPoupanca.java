public class ContaPoupanca extends Pessoa{


    double selic = 8.6;
    double rendimento;



    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void calcularRendimento() {
        if (saldo > 0) {
            if (selic > 8.5) {
                rendimento = 0.005 * saldo;
            } else {
                rendimento = 0.007 * selic * saldo;
            }
            System.out.println("Rendimento: " + rendimento);
        } else {
            System.out.println("Saldo insuficiente para calcular rendimento.");
        }
    }


}
