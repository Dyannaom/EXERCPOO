package EX7;

/**
 * @author Dyanna Mousinho
 * @version 1.0.0
 */

public abstract class Funcionario {
    private String nome;
    private int idade;
    private Double salario;
    private Funcionario() {
    }
    public Funcionario(String nome, int idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
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
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public double bonificacao() {
        return this.salario;
    }
    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
    }

}
