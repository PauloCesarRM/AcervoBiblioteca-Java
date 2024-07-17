public class Periodicos extends ItemAcervo {

    private String editora;
    private String issn;

    public Periodicos(String titulo, String autor, int ano, String editora, String issn) {
        super(titulo, autor, ano);
        this.editora = editora;
        this.issn = issn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Editora: " + getEditora());
        System.out.println("Issn: " + getIssn());
    }
}
