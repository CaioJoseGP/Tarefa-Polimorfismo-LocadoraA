public class Emprestimo {
    private Cliente cliente;
    private Carro carro;
    private int numRenovacao;
    private double valorFinal;

    public Emprestimo(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.cliente.incrementarTotalEmprestimos();
        this.carro = carro;
        this.carro.setDisponivel(false);
        this.numRenovacao = 0;
        this.valorFinal = 0;
    }

    public void renovarAluguel() {
        numRenovacao++;
    }

    public void calcValorFinal() {
        this.carro.calcMultaTotal(numRenovacao);
        this.valorFinal = (this.carro.getValorLocacao() * numRenovacao) + this.carro.getValorMultaTotal();
    }

    public void realizarDevolucao() {
        this.calcValorFinal();
        this.carro.setDisponivel(true);
        this.cliente.decrementarTotalEmprestimos();
    }

    // getters & setters
    public Cliente getCliente() {
        return cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getNumRenovacao() {
        return numRenovacao;
    }

    public void setNumRenovacao(int numRenovacao) {
        this.numRenovacao = numRenovacao;
    }

    public double getValorFinal() {
        return valorFinal;
    }
}