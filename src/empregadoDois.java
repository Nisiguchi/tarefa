public class empregadoDois {
    private String nome;
    private String matricula;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getDesconto() {
        double desconto;
        
        if (salario < 1300) {
            desconto = salario * 8 / 100;
        } else if (salario < 2500) {
            desconto = salario * 9 / 100;
        } else if (salario < 4200) {
            desconto = salario * 11 / 100;
        } else {
            desconto = salario - 457.83;
        }
        
        return desconto;
    }
    
    public double getSalarioLiquido() {
        return salario - getDesconto();
    }

    public String toString() {
        return "Empregado" 
                + "Nome: " + nome
                + "Matricula: " + matricula
                + "Idade: " + idade
                + "Salario Bruto: R$ " + salario
                + "Desconto: - R$ " + getDesconto()
                + "Salario Liquido: R$ " + getSalarioLiquido();
    }    
}
