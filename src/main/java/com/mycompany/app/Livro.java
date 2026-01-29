public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel = true;

    // Construtor para facilitar a criação na Main
    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public String getGenero() { return genero; }

    // VERIFIQUE SE ESTES NOMES ESTÃO EXATAMENTE ASSIM:
    public boolean eDisponivel() {
        return disponivel;
    }

    public void mudarDisponibilidade() {
        this.disponivel = !this.disponivel;
    }
}