public abstract class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private int totalEmprestimos;
    
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.totalEmprestimos = 0;
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

    public int getTotalEmprestimos() {
        return totalEmprestimos;
    }

    public void incrementarTotalEmprestimos() {
        this.totalEmprestimos++;
    }

    public void decrementarTotalEmprestimos() {
        if(this.totalEmprestimos >= 0) {
            this.totalEmprestimos--;
        }
        
        return;
    }


}
