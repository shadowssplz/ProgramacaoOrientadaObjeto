import java.util.ArrayList;
import java.util.Scanner;

public class 1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> filmesDisponiveis = new ArrayList<String>();
        ArrayList<String> filmesAlugados = new ArrayList<String>();
        
        filmesDisponiveis.add("Filme 1");
        filmesDisponiveis.add("Filme 2");
        filmesDisponiveis.add("Filme 3");
        
        int opcao = 0;
        
        while (opcao != 3) {
            
            System.out.println("-------- LOCADORA DE FILMES --------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alugar filme");
            System.out.println("2 - Devolver filme");
            System.out.println("3 - Sair");
            System.out.print("Opção escolhida: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Filmes disponíveis para aluguel:");
                    for (String filme : filmesDisponiveis) {
                        System.out.println(filme);
                    }
                    System.out.print("Digite o nome do filme que deseja alugar: ");
                    String filmeEscolhido = scanner.next();
                    if (filmesDisponiveis.contains(filmeEscolhido)) {
                        filmesDisponiveis.remove(filmeEscolhido);
                        filmesAlugados.add(filmeEscolhido);
                        System.out.println("Filme " + filmeEscolhido + " alugado com sucesso!");
                    } else {
                        System.out.println("Filme não disponível para aluguel.");
                    }
                    break;
                case 2:
                    System.out.println("Filmes alugados:");
                    for (String filme : filmesAlugados) {
                        System.out.println(filme);
                    }
                    System.out.print("Digite o nome do filme que deseja devolver: ");
                    String filmeDevolvido = scanner.next();
                    if (filmesAlugados.contains(filmeDevolvido)) {
                        filmesAlugados.remove(filmeDevolvido);
                        filmesDisponiveis.add(filmeDevolvido);
                        System.out.println("Filme " + filmeDevolvido + " devolvido com sucesso!");
                    } else {
                        System.out.println("Filme não alugado.");
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar nossa locadora!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        
        scanner.close();
    }
}