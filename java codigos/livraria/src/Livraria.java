import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
    private ArrayList<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void mostrarLivros() {
        if (livros.size() == 0) {
            System.out.println("Não há livros cadastrados.");
            return;
        }
        System.out.println("Livros disponíveis na livraria:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livraria livraria = new Livraria();

        // Cadastrar alguns livros para teste
        livraria.adicionarLivro(new Livro("Java Como Programar", "Deitel & Deitel", 2015));
        livraria.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livraria.adicionarLivro(new Livro("O Código Da Vinci", "Dan Brown", 2003));

        int opcao = 0;
        do {
            System.out.println("\n== Livraria ==\n");
            System.out.println("1. Mostrar livros disponíveis");
            System.out.println("2. Adicionar novo livro");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    livraria.mostrarLivros();
                    break;
                case 2:
                    scanner.nextLine(); // Consumir o \n deixado pelo nextInt()
                    System.out.print("\nTítulo do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de lançamento do livro: ");
                    int ano = scanner.nextInt();
                    Livro novoLivro = new Livro(titulo, autor, ano);
                    livraria.adicionarLivro(novoLivro);
                    System.out.println("\nLivro cadastrado com sucesso!");
                    break;
                case 0:
                    System.out.println("\nObrigado por visitar a livraria!");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
            }
        } while (opcao != 0);
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + ano + ")";
    }
}
