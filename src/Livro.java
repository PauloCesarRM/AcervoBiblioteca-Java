public class Livro extends ItemAcervo {

    private String editoraLivro;
    private String isbn;
    private int paginas;
    private String edicao;

    public Livro(String titulo, String autor, int ano, String editoraLivro, String isbn, int paginas, String edicao) {
        super(titulo, autor, ano);
        this.editoraLivro = editoraLivro;
        this.isbn = isbn;
        this.paginas = paginas;
        this.edicao = edicao;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: "+ getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Editora: " + editoraLivro);
        System.out.println("ISBN: " + isbn);
        System.out.println("Paginas: " + paginas);
        System.out.println("Edicao: " + edicao);
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
