public class Jornal extends Periodicos{
    private String cidade;

    public Jornal(String titulo, String autor, int ano, String editora, String issn, String cidade) {
        super(titulo, autor, ano, editora, issn);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Cidade: " + cidade);
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
