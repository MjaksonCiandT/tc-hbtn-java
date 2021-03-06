public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    protected int identificador;

    public Tarefa(String descricao, int identificador){
        this.descricao=descricao;
        this.identificador=identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    static public String modificarDescricao(String descricao){
        if (descricao != null && descricao != " "){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }else {
            return descricao;
        }
    }
}
