package classes;
import java.util.Scanner;

public class User {
    private String name;
    private String log;
    private String pass;

    public void setName(String name){
        this.name = name;
    }
   
    public String getName(){
        return this.name;
    }

    public void setLog(String login){
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                boolean hasUpperCase = false;
                for (int i = 0; i < login.length(); i++) {
                    if (Character.isUpperCase(login.charAt(i))) {
                        hasUpperCase = true;
                        break;
                    }
                }
                if (hasUpperCase) {
                    this.log = login.toUpperCase();
                    break;
                } else {
                    System.out.println("Escreva o Login em CAIXA ALTA");
                    login = input.nextLine();
                }
            }
        }
    }
   
    public String getLog(){
        return this.log;
    }

    public void setPass(String pass){
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                if (pass.length() > 16) {
                    System.out.println("Escreva no máximo 16 caracteres");
                    pass = input.nextLine();
                } else {
                    this.pass = pass;
                    break;
                }
            }
        }
    }
   
    public String getPass(){
        return this.pass;
    }
}
