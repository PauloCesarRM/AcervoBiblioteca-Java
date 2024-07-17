public class DVD extends Midias{
    private String resoulucao;

    public DVD(String titulo, String autor, int ano, String duracao, String idioma, String resoulucao) {
        super(titulo, autor, ano, duracao, idioma);
        this.resoulucao = resoulucao;
    }

    public String getResoulucao() {
        return resoulucao;
    }

    public void setResoulucao(String resoulucao) {
        this.resoulucao = resoulucao;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Resoulucao: " + getResoulucao());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));

    }
}
