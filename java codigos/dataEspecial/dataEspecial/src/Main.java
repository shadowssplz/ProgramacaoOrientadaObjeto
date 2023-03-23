public class Main {
    
    public static void main(String[] args) {
        
        DataEspecial natal = new DataEspecial("Natal", "25/12/2023");
        
        System.out.println("Nome da data especial: " + natal.getNome());
        System.out.println("Data: " + natal.getData());
        
        natal.setData("24/12/2023");
        
        System.out.println("Nova data: " + natal.getData());
    }
}