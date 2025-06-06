public class CarroLuxo extends Carro {
    private int qntdAirBags;
    private double tamanhoPortaMalas;
    private boolean temGPS;

    public CarroLuxo(String marca, String modelo, String placa, String ano, double valorLocacao, double valorMulta, int qntdAirBags, double tamanhoPortaMalas, boolean temGPS) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.qntdAirBags = qntdAirBags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.temGPS = temGPS;
    }

    @Override
    public void calcMultaTotal(int numRenovacao) {
        if(numRenovacao > 5) {
            super.calcMultaTotal(numRenovacao);
        }
    }

    // getters & setters
    public int getQntdAirBags() {
        return qntdAirBags;
    }

    public void setQntdAirBags(int qntdAirBags) {
        this.qntdAirBags = qntdAirBags;
    }

    public double getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(double tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean isTemGPS() {
        return temGPS;
    }

    public void setTemGPS(boolean temGPS) {
        this.temGPS = temGPS;
    }
}
