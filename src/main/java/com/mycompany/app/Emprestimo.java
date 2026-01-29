import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    
    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;

        
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.MAY, 8, 23, 37, 21);
        
        this.dataRetirada = cal.getTime();
        this.dataDevolucao = cal.getTime();
    }

    
    public Date getDataRetirada() { return dataRetirada; }
    public Date getDataDevolucao() { return dataDevolucao; }
    public Livro getLivro() { return livro; }
    public Usuario getUsuario() { return usuario; }

  
    public void imprimirResumo() {
       
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
        
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + sdf.format(dataRetirada));
        System.out.println("Data de Devolucao: " + sdf.format(dataDevolucao));
    }
}
