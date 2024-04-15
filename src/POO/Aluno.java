package POO;
// criando uma herança - pegar tudo o que tem na classe Pessoa, herdar de uma classe para outra
public class Aluno extends Pessoa{
    //atributos
    private int matricula;

    // construtor
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void estudo(){
        System.out.println("Aluno " + getNome() + " estudando!");
}
    public void exibirInformacoesaluno() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Matricula: " + matricula);
    }
}
