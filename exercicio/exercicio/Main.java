package exercicio;

public class Main {
    public static void main(String[] args) {
        Pessoa pess = new Pessoa("Jim", "Knopf", 31);
        pess.setIdade(32);

        System.out.println(pess);

        Endereco endereco = new Endereco();

        endereco.setCidade("Natal");
        endereco.setPais("Brasil");
        endereco.setNumero("999");
        endereco.setCep("59999-999");
        endereco.setRua("Rua Grande");
        
        System.out.println(endereco);

        pess.setEndereco(endereco);

        endereco = null;

        pess.getEndereco().setNumero("1000");
        System.out.println(pess);
        System.out.println(pess.getEndereco());
    }
}