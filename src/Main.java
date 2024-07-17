import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("_________");
            System.out.println("Olá, seja bem-vindo à biblioteca!");
            System.out.println("Insira uma opção:");
            System.out.println("1 - Cadastrar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Verificar a disponibilidade do item no acervo");
            System.out.println("4 - Verificar itens emprestados");
            System.out.println("5 - Devolver item");
            System.out.println("6 - Sair da biblioteca");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo de item (Livro, Revista, Jornal, Monografia, Dissertacao, Tese, Relatorio, Fita, CD, DVD, Cartaz, Mapa):");
                    String tipo = scanner.nextLine();
                    cadastrarItem(biblioteca, tipo, scanner);
                    break;
                case 2:
                    System.out.println("Digite o título do item para remover:");
                    String tituloRemover = scanner.nextLine();
                    biblioteca.removerItem(tituloRemover);
                    break;
                case 3:
                    System.out.println("Digite o termo de pesquisa:");
                    String termo = scanner.nextLine();
                    biblioteca.pesquisarItem(termo);
                    break;
                case 4:
                    biblioteca.listarItensEmprestados();
                    break;
                case 5:
                    System.out.println("Digite o título do item para devolver:");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverItem(tituloDevolver);
                    break;
                case 6:
                    System.out.println("Saindo da biblioteca. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }

    private static void cadastrarItem(Biblioteca biblioteca, String tipo, Scanner scanner) {
        System.out.println("Digite o título:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor:");
        String autor = scanner.nextLine();
        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        switch (tipo.toLowerCase()) {
            case "livro":
                System.out.println("Digite a editora:");
                String editoraLivro = scanner.nextLine();
                System.out.println("Digite o ISBN:");
                String isbnLivro = scanner.nextLine();
                System.out.println("Digite o número de páginas:");
                int paginas = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer
                System.out.println("Digite a edição:");
                String edicao = scanner.nextLine();
                Livro livro = new Livro(titulo, autor, ano, editoraLivro, isbnLivro, paginas, edicao);
                biblioteca.adicionarItem(livro);
                break;
            case "revista":
                System.out.println("Digite a editora:");
                String editoraRevista = scanner.nextLine();
                System.out.println("Digite o ISSN:");
                String issnRevista = scanner.nextLine();
                System.out.println("Digite o departamento:");
                String departamentoRevista = scanner.nextLine();
                Revista revista = new Revista(titulo, autor, ano, editoraRevista, issnRevista, departamentoRevista);
                biblioteca.adicionarItem(revista);
                break;
            case "jornal":
                System.out.println("Digite a editora:");
                String editoraJornal = scanner.nextLine();
                System.out.println("Digite o ISSN:");
                String issnJornal = scanner.nextLine();
                System.out.println("Digite a cidade:");
                String cidadeJornal = scanner.nextLine();
                Jornal jornal = new Jornal(titulo, autor, ano, editoraJornal, issnJornal, cidadeJornal);
                biblioteca.adicionarItem(jornal);
                break;
            case "monografia":
                System.out.println("Digite o orientador:");
                String orientadorMonografia = scanner.nextLine();
                System.out.println("Digite a data de defesa:");
                String dataDefesaMonografia = scanner.nextLine();
                System.out.println("Digite o tema:");
                String temaMonografia = scanner.nextLine();
                System.out.println("Digite o curso:");
                String cursoMonografia = scanner.nextLine();
                System.out.println("Digite a conclusão:");
                String conclusaoMonografia = scanner.nextLine();
                Monografia monografia = new Monografia(titulo, autor, ano, orientadorMonografia, dataDefesaMonografia, temaMonografia, cursoMonografia, conclusaoMonografia);
                biblioteca.adicionarItem(monografia);
                break;
            case "dissertacao":
                System.out.println("Digite o orientador:");
                String orientadorDissertacao = scanner.nextLine();
                System.out.println("Digite a data de defesa:");
                String dataDefesaDissertacao = scanner.nextLine();
                System.out.println("Digite o tema:");
                String temaDissertacao = scanner.nextLine();
                System.out.println("Digite o departamento:");
                String departamentoDissertacao = scanner.nextLine();
                System.out.println("Digite a metodologia:");
                String metodologiaDissertacao = scanner.nextLine();
                Dissertacao dissertacao = new Dissertacao(titulo, autor, ano, orientadorDissertacao, dataDefesaDissertacao, temaDissertacao, departamentoDissertacao, metodologiaDissertacao);
                biblioteca.adicionarItem(dissertacao);
                break;
            case "tese":
                System.out.println("Digite o orientador:");
                String orientadorTese = scanner.nextLine();
                System.out.println("Digite a data de defesa:");
                String dataDefesaTese = scanner.nextLine();
                System.out.println("Digite o tema:");
                String temaTese = scanner.nextLine();
                System.out.println("Digite a universidade:");
                String universidadeTese = scanner.nextLine();
                Tese tese = new Tese(titulo, autor, ano, orientadorTese, dataDefesaTese, temaTese, universidadeTese);
                biblioteca.adicionarItem(tese);
                break;
            case "relatorio":
                System.out.println("Digite o departamento:");
                String departamentoRelatorio = scanner.nextLine();
                Relatorio relatorio = new Relatorio(titulo, autor, ano, departamentoRelatorio);
                biblioteca.adicionarItem(relatorio);
                break;
            case "fita":
                System.out.println("Digite a duração:");
                String duracaoFita = scanner.nextLine();
                System.out.println("Digite o idioma:");
                String idiomaFita = scanner.nextLine();
                System.out.println("Digite o formato (VHS ou CASSETE):");
                String formato = scanner.nextLine().toUpperCase();
                Fita.Formato formatoEnum = Fita.Formato.valueOf(formato);
                Fita fita = new Fita(titulo, autor, ano, duracaoFita, idiomaFita, formatoEnum);
                biblioteca.adicionarItem(fita);
                break;
            case "cd":
                System.out.println("Digite a duração:");
                String duracaoCD = scanner.nextLine();
                System.out.println("Digite o idioma:");
                String idiomaCD = scanner.nextLine();
                System.out.println("Digite o número de faixas:");
                String numFaixas = scanner.nextLine();
                CD cd = new CD(titulo, autor, ano, duracaoCD, idiomaCD, numFaixas);
                biblioteca.adicionarItem(cd);
                break;
            case "dvd":
                System.out.println("Digite a duração:");
                String duracaoDVD = scanner.nextLine();
                System.out.println("Digite o idioma:");
                String idiomaDVD = scanner.nextLine();
                System.out.println("Digite a resolução:");
                String resolucaoDVD = scanner.nextLine();
                DVD dvd = new DVD(titulo, autor, ano, duracaoDVD, idiomaDVD, resolucaoDVD);
                biblioteca.adicionarItem(dvd);
                break;
            case "cartaz":
                System.out.println("Digite a dimensão:");
                String dimensaoCartaz = scanner.nextLine();
                Cartaz cartaz = new Cartaz(titulo, autor, ano, dimensaoCartaz);
                biblioteca.adicionarItem(cartaz);
                break;
            case "mapa":
                System.out.println("Digite a escala:");
                String escalaMapa = scanner.nextLine();
                Mapa mapa = new Mapa(titulo, autor, ano, escalaMapa);
                biblioteca.adicionarItem(mapa);
                break;
            default:
                System.out.println("Tipo de item inválido.");
                break;
        }
    }
}
