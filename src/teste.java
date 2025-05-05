public class teste {
    public static void main(String[] args) {
        banco b = new banco();
        b.setCodigo(123);
        b.setNome("Bradesco");
        b.setPaisOrigem("Brasil");
        System.out.println(b);
        
        contaCorrente cc = new contaCorrente();
        cc.setNumero(111);
        cc.setSaldo(1000);
        cc.setTipo(11);
        System.out.println(cc);
        
        endereco e = new endereco();
        e.setNumero(22);
        e.setRua("QNO 03 Conjunto O ");
        e.setTelefone("(61) 9999-9999");
        System.out.println(e);
        
        agencia a = new agencia();
        a.setNome("Agencia Cliente");
        a.setNumero(111111);
        System.out.println(a);
        
        cliente c1 = new cliente();
        c1.setCpf("999.999.999-99");
        c1.setIdentidade("9.999.999 SSP/DF");
        c1.setNome("Josias Silva");
        System.out.println(c1);
        
        cliente c2 = new cliente();
        c2.setCpf("111.111.111-11");
        c2.setIdentidade("1.111.111 SSP/GO");
        c2.setNome("Jose Bezerra");
        
        System.out.println(c2);
    }
}
