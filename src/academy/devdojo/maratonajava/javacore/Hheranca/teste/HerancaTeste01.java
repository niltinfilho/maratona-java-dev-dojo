package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-678");
        Pessoa pessoa = new Pessoa("Jorge");
        pessoa.setCpf("111111111-11");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("----------------");
        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("123456789-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
