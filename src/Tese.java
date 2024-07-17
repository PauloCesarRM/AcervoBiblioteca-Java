public class Tese extends TrabalhosDeConclusao{
    private String universidade;

    public Tese(String titulo, String autor, int ano, String orientador, String dataDefesa, String tema, String universidade) {
        super(titulo, autor, ano, orientador, dataDefesa, tema);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Universidade de " + getUniversidade());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
