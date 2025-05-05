public class banco {

    private int codigo;
    private String nome;
    private String paisOrigem;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String toString() {
        return "Banco" 
                + "Codigo: " + codigo
                + "Nome: " + nome
                + "Pais de Origem: " + paisOrigem;
    }
}
