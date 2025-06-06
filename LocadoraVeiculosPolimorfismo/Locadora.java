import java.util.ArrayList;

public class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Carro> carrosDisponiveis;
    private ArrayList<Cliente> clientes;
    private ArrayList<Emprestimo> emprestimos;

    public Locadora(String nome, String endereco, String telefone, ArrayList<Carro> carrosDisponiveis, ArrayList<Cliente> clientes, ArrayList<Emprestimo> emprestimos) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carrosDisponiveis = carrosDisponiveis;
        this.clientes = clientes;
        this.emprestimos = emprestimos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Carro> getCarrosDisponiveis() {
        return carrosDisponiveis;
    }

    public void setCarrosDisponiveis(ArrayList<Carro> carrosDisponiveis) {
        this.carrosDisponiveis = new ArrayList<>(carrosDisponiveis);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = new ArrayList<>(clientes);
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = new ArrayList<>(emprestimos);
    }
}