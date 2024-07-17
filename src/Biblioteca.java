import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<ItemAcervo> acervo;

    public Biblioteca(){
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(ItemAcervo item){
        acervo.add(item);
    }

    public void removerItem(String titulo){
        ItemAcervo itemParaRemover = null;
        for (ItemAcervo item : acervo){
            if(item.getTitulo().equalsIgnoreCase(titulo)){
                itemParaRemover = item;
                break;
            }
        }
        if (itemParaRemover != null){
            acervo.remove(itemParaRemover);
            System.out.println("Item removido com sucesso");
        }else {
            System.out.println("Item não encontrado");
        }
    }

    public void pesquisarItem(String termo){
        String termoLowerCase = termo.toLowerCase();
        List<ItemAcervo> resultados = new ArrayList<>();
        for (ItemAcervo item : acervo){
            if (item.getTitulo().toLowerCase().contains(termoLowerCase) || item.getAutor().toLowerCase().contains(termoLowerCase)){
                resultados.add(item);
            }
        }
        if(resultados.isEmpty()){
            System.out.println("Nenhum item encontrado");
        }else {
            System.out.println("Item encontrado");
            for (ItemAcervo item : resultados){
                item.imprimirFicha();
                System.out.println();
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o título do item para verificar a disponibilidade: ");
            String titulo = scanner.nextLine();

            for (ItemAcervo item : resultados){
                if(item.getTitulo().equalsIgnoreCase(titulo)){
                    if(!item.isEmprestado()){
                        System.out.println("O item está disponível. Deseja emprestá-lo? (s/n");
                        String resposta = scanner.nextLine();
                        if (resposta.equalsIgnoreCase("s")){
                            item.emprestar();
                        }
                    }else{
                        System.out.println("O item já está emprestado");
                    }
                    return;
                }
            }
            System.out.println("Título não encotnrado na lista de resultados");
        }
    }

    public void listarItensEmprestados(){
        boolean hasEmprestados = false;
        for (ItemAcervo item : acervo){
            if(item.isEmprestado()){
                item.imprimirFicha();
                hasEmprestados = true;
            }
        }
        if(!hasEmprestados){
            System.out.println("Nenhum item emprestado no momento");
        }
    }

    public void devolverItem(String titulo){
        for (ItemAcervo item : acervo){
            if (item.getTitulo().equalsIgnoreCase(titulo)){
                item.devolver();
                return;
            }
        }
        System.out.println("Nenhum item encontrado");
    }
}
