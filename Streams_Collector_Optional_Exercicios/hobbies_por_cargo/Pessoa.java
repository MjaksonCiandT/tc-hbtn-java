import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String cargo;
    private int codigo;
    private int idade;
    private double salario;

    private List<String> hobbies = new ArrayList<>();

    public Pessoa(){
    }

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String>hobies) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.setHobbies(hobies);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public List<String> getHobbies() {
        return hobbies;
    }


    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return   String.format("[%d] %s %s %d R$ %f",codigo,nome,cargo,idade,salario);
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return nome.compareTo(pessoa.getNome());
    }
}
