    import veiculo;
    import empregado;
    
    public class testeDois {
        public static void main(String[] args) {
            veiculo v1 = new veiculo();
            v1.setAno(2010);
            v1.setProprietario("Marcelino");
            System.out.println("Ano: " + v1.getAno());
            System.out.println("Proprietario: " + v1.getProprietario());
            
            veiculo v2 = new veiculo();
            v2.setAno(2014);
            v2.setProprietario("Ana Julia");
            System.out.println("Ano: " + v2.getAno());
            System.out.println("Proprietario: " + v2.getProprietario());
            
            empregado e1 = new empregado();
            e1.setIdade(37);
            e1.setMatricula("123456-0");
            e1.setNome("Marcelino");
            e1.setSalario(2300);
            System.out.println("Matricula: " + e1.getMatricula());
            System.out.println("Nome: " + e1.getNome());
            System.out.println("Idade: " + e1.getIdade());
            System.out.println("Salario: " + e1.getSalario());
           
            empregado e2 = new empregado();
            e2.setIdade(22);
            e2.setMatricula("00000-0");
            e2.setNome("Mariana");
            e2.setSalario(1300);
            System.out.println("Matricula: " + e2.getMatricula());
            System.out.println("Nome: " + e2.getNome());
            System.out.println("Idade: " + e2.getIdade());
            System.out.println("Salario: " + e2.getSalario());
        }
}
