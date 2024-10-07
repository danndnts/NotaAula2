public class Uber {

    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;


    public Uber(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValorCorrida() {
        double valorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
        return valorFinal;
    }

    public void exibirDetalhesCorrida() {
        System.out.println("Detalhes da Corrida:");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Tempo de espera: " + tempoEspera + " minutos");
        System.out.println("Tarifa base: R$ " + tarifaBase);
        System.out.println("Fator de demanda: " + fatorDemanda);
        System.out.println("Valor final da corrida: R$ " + calcularValorCorrida());
    }

}
