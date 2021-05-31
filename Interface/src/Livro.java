public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalDePaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalDePaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePaginas = totalDePaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;

    }


    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalDePaginas=" + totalDePaginas +
                ", paginaAtual=" + paginaAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() +
                '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folear(int pag) {
        this.paginaAtual = pag;

    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;

    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }


}
