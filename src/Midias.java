public class Midias extends ItemAcervo{
    private String duracao;
    private String idioma;

    public Midias(String titulo, String autor, int ano, String duracao, String idioma) {
        super(titulo, autor, ano);
        this.duracao = duracao;
        this.idioma = idioma;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Idioma: " + getIdioma());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
