public class CD extends Midias{
    private String num_faixa;

    public CD(String titulo, String autor, int ano, String duracao, String idioma, String num_faixa) {
        super(titulo, autor, ano, duracao, idioma);
        this.num_faixa = num_faixa;
    }

    public String getNum_faixa() {
        return num_faixa;
    }

    public void setNum_faixa(String num_faixa) {
        this.num_faixa = num_faixa;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Número de faixas do CD: " + getNum_faixa());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
