import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n===== Agenda Telefônica =====");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Editar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Buscar contato por nome");
            System.out.println("5. Buscar contato por telefone");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(new Contato(nome, telefone));
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do contato para editar: ");
                    String nomeParaEditar = scanner.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTelefone = scanner.nextLine();
                    agenda.editarContato(nomeParaEditar, novoTelefone);
                    break;

                case 3:
                    System.out.print("Nome do contato para remover: ");
                    String nomeParaRemover = scanner.nextLine();
                    agenda.removerContato(nomeParaRemover);
                    break;

                case 4:
                    System.out.print("Nome do contato para buscar: ");
                    String nomeParaBuscar = scanner.nextLine();
                    Contato contatoNome = agenda.buscarContatoPorNome(nomeParaBuscar);
                    if (contatoNome != null) {
                        System.out.println(contatoNome);
                    }
                    break;

                case 5:
                    System.out.print("Telefone do contato para buscar: ");
                    String telefoneParaBuscar = scanner.nextLine();
                    Contato contatoTelefone = agenda.buscarContatoPorTelefone(telefoneParaBuscar);
                    if (contatoTelefone != null) {
                        System.out.println(contatoTelefone);
                    }
                    break;

                case 6:
                    System.out.println("Saindo da agenda...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
