public class agencia {

        private int numero;
        private String nome;
    
        public int getNumero() {
            return numero;
        }
    
        public void setNumero(int numero) {
            this.numero = numero;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String toString() {
            return "Agencia"
                    + "Numero: " + numero
                    + "Nome: " + nome;
        }

    }


