public class Cartaz extends ItemAcervo{
    private String dimensao;

    public Cartaz(String titulo, String autor, int ano, String dimensao) {
        super(titulo, autor, ano);
        this.dimensao = dimensao;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Dimensao: " + getDimensao());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
