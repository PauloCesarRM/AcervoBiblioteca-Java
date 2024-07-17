public class Dissertacao extends TrabalhosDeConclusao{
    private String departamento;
    private String metodologia;

    public Dissertacao(String titulo, String autor, int ano, String orientador, String dataDefesa, String tema, String departamento, String metodologia) {
        super(titulo, autor, ano, orientador, dataDefesa, tema);
        this.departamento = departamento;
        this.metodologia = metodologia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Metodologia: " + getMetodologia());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));

    }
}
