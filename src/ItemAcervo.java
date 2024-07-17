public abstract class ItemAcervo implements Emprestavel {
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado;

    public ItemAcervo(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void emprestar() {
        if (!emprestado){
            emprestado = true;
            System.out.println("Item emprestado com sucesso!");
        }else {
            System.out.println("Item já está emprestado");
        }
    }

    @Override
    public void devolver() {
        if (emprestado){
            emprestado = false;
            System.out.println("Item devolvido com sucesso!");
        }else {
            System.out.println("Item não esta emprestado");
        }
    }

    @Override
    public boolean isEmprestado() {
        return emprestado;
    }

    public abstract void imprimirFicha();

}
