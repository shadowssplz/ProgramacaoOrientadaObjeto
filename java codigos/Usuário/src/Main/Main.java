package Main;
import classes.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite seu nome:");
            String name = input.nextLine();
            user.setName(name);

            System.out.println("Digite seu login:");
            String login = input.nextLine();
            user.setLog(login);

            System.out.println("Digite sua senha:");
            String password = input.nextLine();
            user.setPass(password);
        }

        System.out.println("Nome: " + user.getName());
        System.out.println("Login: " + user.getLog());
        System.out.println("Senha: " + user.getPass());
    }
}

