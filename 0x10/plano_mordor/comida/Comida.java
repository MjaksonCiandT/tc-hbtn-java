package comida;
public abstract class Comida {
    protected int pontosDeFelicidade;

    public int getPontosdeFelicidades()
    {
        return this.pontosDeFelicidade;
    }
    public int setPontosdeFelicidades(int pontosDeFelicidade)
    {
        return this.pontosDeFelicidade=pontosDeFelicidade;
    }

    public Comida(int pontosDeFelicidade) {
        this.pontosDeFelicidade += pontosDeFelicidade;
    }

    public int getPontosDeFelicidade() {
        return this.pontosDeFelicidade;
    }
}
