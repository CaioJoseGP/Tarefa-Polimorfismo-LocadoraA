public abstract class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private double valorLocacao;
    private double valorMulta;
    private double valorMultaTotal;
    private boolean disponivel;

    public Carro(String marca, String modelo, String placa, String ano, double valorLocacao, double valorMulta) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.valorMulta = valorMulta;
        this.valorMultaTotal = 0;
        this.disponivel = true;
    }

    public void calcMultaTotal(int numRenovacao) {
        this.valorMultaTotal = this.valorMulta * numRenovacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public double getValorMultaTotal() {
        return valorMultaTotal;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
