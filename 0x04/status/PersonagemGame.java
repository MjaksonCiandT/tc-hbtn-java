public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String setsaudeDoPersonagem() {
        String statusMaiorqueZero = "vivo";
        String statusIgual_A_Zero = "morto";

        if (saudeAtual > 0){
            this.status=statusMaiorqueZero;
        }else if (saudeAtual == 0){
            this.status=statusIgual_A_Zero;
        }
        return status;
    }

    public int receberCura(int quantidadeDeCura) {

        int saudeMaximaDoPersonagem = 100;

        if (saudeAtual + quantidadeDeCura > saudeMaximaDoPersonagem) {
            this.saudeAtual=saudeMaximaDoPersonagem;
        }else {
            this.saudeAtual=saudeAtual+quantidadeDeCura;
        }
        return quantidadeDeCura;
    }

    public int tomarDano(int quantidadeDeDano) {

        int saudeMínimaDoPersonagem = 0;
        if ( saudeAtual > saudeMínimaDoPersonagem) {
            this.saudeAtual=saudeAtual - quantidadeDeDano;
        } if (saudeAtual < saudeMínimaDoPersonagem) {
            return this.saudeAtual= saudeMínimaDoPersonagem;
        }else {
            return saudeAtual;
        }
    }

    public String getStatus() {
        return this.setsaudeDoPersonagem();
    }
}
