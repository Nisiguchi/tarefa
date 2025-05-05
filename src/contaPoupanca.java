public class contaPoupanca {
    private String nomeTitular;
    private String numeroConta;
    private double saldo;
    private double taxaJuros;

    public contaPoupanca(String string, String string2, double d, double e) {
        //TODO Auto-generated constructor stub
    }

    public void setnomeTitular( String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setnumeroConta( String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setsaldo( double saldo ) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void settaxaJuros( double taxaJuros ) {
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public String toString() {
        return "Titular: " + nomeTitular +
               "Número da Conta: " + numeroConta +
               "Saldo: R$ " + String.format("%.2f", saldo) +
               "Taxa de Juros: " + taxaJuros + "% ao mês";
    }

}
