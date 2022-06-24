import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    protected String titulo;
    protected String autor;
    protected double preco;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public void setTitulo(String titulo) throws AutorInvalidoException {

        if (titulo.length()>=3){
            this.titulo = titulo;
        }else {

            throw new AutorInvalidoException("Titulo de livro invalido");
        }

    }

    public void setAutor(String autor) throws AutorInvalidoException {

        if (autor.length() >= 9) {
            this.autor = autor;
        }else {

            throw new AutorInvalidoException("Nome de autor invalido");
        }
    }

    public void setPreco(double preco) throws LivroInvalidoException {

        if (preco > 0) {
            this.preco = preco;
        }else{
            throw new  LivroInvalidoException("Preco de livro invalido");
        }
    }
}
