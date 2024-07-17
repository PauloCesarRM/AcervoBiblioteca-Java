public class Relatorio extends ItemAcervo{
    private String departamento;

    public Relatorio(String titulo, String autor, int ano, String departamento) {
        super(titulo, autor, ano);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
