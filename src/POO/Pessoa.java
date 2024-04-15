package POO;

public class Pessoa {
//atributos
        private String nome;
        private int idade;
//construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
//Implementamos métodos para definir e obter o nome e a idade. get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    public void andar() {
        System.out.println("Pessoa com o nome de " + getNome() + " esta andando!");
    }
   // poliformismo -- sobrecarga
    public void andar(String nome_acompanhante){
        System.out.println("Pessoa com o nome de " + getNome() + " esta andando com a pessoa " + nome_acompanhante);
    }
}
