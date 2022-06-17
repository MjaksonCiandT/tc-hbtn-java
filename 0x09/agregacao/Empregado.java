public class Empregado {
    private String nome;
    private int codigo;
    private Endereco end;

    public Empregado(String jane_doe, int i, Endereco end) {
        this.codigo=i;
        this.nome=jane_doe;
        this.end= end;
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

    public Endereco getEnd() {
        return end;
    }
    public void setEnd(Endereco end) {
        this.end= end;
    }

    public void apresentar() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Bairro: " + end.getBairro());
        System.out.println("Cidade: " + end.getCidade());
        System.out.println("Pais: " + end.getPais());
    }
}