public class veiculo {
    private String proprietario;
    private int ano;

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Veiculo"
                + "Proprietario: " + proprietario
                + "Ano: " + ano;
    }
    
    
}
