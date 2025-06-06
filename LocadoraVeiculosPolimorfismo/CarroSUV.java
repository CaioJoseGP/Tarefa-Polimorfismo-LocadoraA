public class CarroSUV extends Carro {
    private double tamanhoPortaMalas; 
    private String tipoTracao;
    private String tipoCombustivel;

    public CarroSUV(String marca, String modelo, String placa, String ano, double valorLocacao, double valorMulta, double tamanhoPortaMalas, String tipoTracao, String tipoCombustivel) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void calcMultaTotal(int numRenovacao) {
        if(numRenovacao > 3) {
            super.calcMultaTotal(numRenovacao);
        }
    }

    // getters & setters
    public double getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(double tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
