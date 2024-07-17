public class TrabalhosDeConclusao extends ItemAcervo{
    private String orientador;
    private String dataDefesa;
    private String tema;

    public TrabalhosDeConclusao(String titulo, String autor, int ano, String orientador, String dataDefesa, String tema) {
        super(titulo, autor, ano);
        this.orientador = orientador;
        this.dataDefesa = dataDefesa;
        this.tema = tema;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Orientador: " + getOrientador());
        System.out.println("Data de defesa: " + getDataDefesa());
        System.out.println("Tema: " + getTema());
        System.out.println("Emprestado: " + (isEmprestado() ? "Sim" : "Não"));
    }
}
