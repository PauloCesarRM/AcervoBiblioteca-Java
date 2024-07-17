public class Monografia extends TrabalhosDeConclusao{
    private String curso;
    private String conclusao;

    public Monografia(String titulo, String autor, int ano, String orientador, String dataDefesa, String tema, String curso, String conclusao) {
        super(titulo, autor, ano, orientador, dataDefesa, tema);
        this.curso = curso;
        this.conclusao = conclusao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Curso: " + curso);
        System.out.println("Conclusao: " + conclusao);
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
