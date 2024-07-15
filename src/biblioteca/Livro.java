public class Livro extends ItemAcervo {

    private String editoraLivro;
    private String isbn;
    private int paginas;
    private String edicao;

    public Livro() {
    }
    public Livro(String editoraLivro, String isbn, int paginas, String edicao) {
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
        super.imprimirFicha();
        System.out.println("Editora: " + editoraLivro);
        System.out.println("ISBN: " + isbn);
        System.out.println("Paginas: " + paginas);
        System.out.println("Edicao: " + edicao);
    }
}
