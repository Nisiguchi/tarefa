public class contaCorrente {
    private int numero;
    private int tipo;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "ContaCorrente" 
                + "Numero: " + numero
                + "Tipo: " + tipo
                + "Saldo: " + saldo;
    }    
}
