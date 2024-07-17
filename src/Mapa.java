public class Mapa extends ItemAcervo{
    private String escala;

    public Mapa(String titulo, String autor, int ano, String escala) {
        super(titulo, autor, ano);
        this.escala = escala;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Escala: " + escala);
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
