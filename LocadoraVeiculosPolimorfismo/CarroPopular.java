public class CarroPopular extends Carro {
    private boolean temAr;

    public CarroPopular(String marca, String modelo, String placa, String ano, double valorLocacao, double valorMulta, boolean temAr) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.temAr = temAr;
    }

    @Override
    public void calcMultaTotal(int numRenovacao) {
        if(numRenovacao > 1) {
            numRenovacao = numRenovacao - 1;
            super.calcMultaTotal(numRenovacao);
        }
    }

    // getters & setters
    public boolean isTemAr() {
        return temAr;
    }

    public void setTemAr(boolean temAr) {
        this.temAr = temAr;
    }
}
