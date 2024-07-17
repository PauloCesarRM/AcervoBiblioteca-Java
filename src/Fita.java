public class Fita extends Midias{
    public enum Formato {
        VHS, CASSETE, NAO_LISTADO
    }

    private Formato formato;

    public Fita(String titulo, String autor, int ano, String duracao, String idioma, Formato formato) {
        super(titulo, autor, ano, duracao, idioma);
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Formato: " + getFormato());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
