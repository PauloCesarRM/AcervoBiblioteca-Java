public class Revista extends Periodicos{
    private String departamento;

    public Revista(String titulo, String autor, int ano, String editora, String issn, String departamento) {
        super(titulo, autor, ano, editora, issn);
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
        super.imprimirFicha();
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
