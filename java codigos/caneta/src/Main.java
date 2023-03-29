public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Caneta usando o construtor personalizado
        Caneta canetaAzul = new Caneta("Bic", "Azul", 50, false);
        
        // Alteração dos valores dos atributos usando os métodos setters
        canetaAzul.setModelo("Faber Castell");
        canetaAzul.setCor("Preta");
        canetaAzul.setCarga(20);
        canetaAzul.setTampada(true);
        
        // Exibição dos valores dos atributos usando os métodos getters
        System.out.println("Modelo: " + canetaAzul.getModelo());
        System.out.println("Cor: " + canetaAzul.getCor());
        System.out.println("Carga: " + canetaAzul.getCarga());
        
        // Exibição do status da caneta usando o método status()
        canetaAzul.status();
    }
}
