public class PersonagemGame {
    private int saudeAtual;
    private String nome;

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

    public int receberCura(int quantidadeDeCura) {

        int saudeMaximaDoPersonagem = 100;

        if (saudeAtual + quantidadeDeCura < saudeMaximaDoPersonagem) {

            this.saudeAtual=saudeAtual + quantidadeDeCura;

        }if (saudeAtual + quantidadeDeCura > saudeMaximaDoPersonagem) {

            return this.saudeAtual=saudeMaximaDoPersonagem;

        } else {
            return saudeAtual;
        }

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
}
