package POO;

import java.util.Scanner;

//No método main, criamos uma instância da classe Pessoa chamada pessoa1 e exibimos suas informações.
public class main {
    public static void main(String[] args) {
        //No método main, utilizamos um objeto Scanner para obter o nome e a idade da pessoa a partir da entrada do usuário.
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite seu nome");
        String nome = leitura.nextLine();
        System.out.println("Digite sua idade");
        int idade = leitura.nextInt();
        //Criamos uma instância da classe Pessoa com os valores informados.
        Pessoa pessoa0 = new Pessoa(nome,idade);
        pessoa0.exibirInformacoes();
        pessoa0.andar();
        System.out.println("************************");
        Pessoa pessoa1 = new Pessoa("suellen", 36);
        pessoa1.andar();
        pessoa1.andar("rubens");
        System.out.println("************************");

        pessoa1.exibirInformacoes();

        System.out.println("************************");

        Aluno aluno1 = new Aluno("livia", 6, 12345);
        aluno1.exibirInformacoesaluno();
        aluno1.estudo();
        aluno1.andar("rubinho");
    }
}
