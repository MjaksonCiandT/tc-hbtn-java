public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String jane_doe, int i, Endereco endereco) {
        this.codigo=i;
        this.nome=jane_doe;
        this.endereco= endereco;
    }

    public String getNome() {
        return this.nome;
    }
    public String setNome(String nome) {
        this.nome=nome;
        return nome;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public int setCodigo(String codigo) {
        return this.codigo= Integer.parseInt(codigo);
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco= endereco;
    }

    public void apresentar() {
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Pais: " + endereco.getPais());
    }
}