import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("João", 2000.0, new Date(), "Analista", "TI");
        
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Data de admissão: " + funcionario.getDataAdmissao());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        
        funcionario.setSalario(2500.0);
        funcionario.setCargo("Analista Sênior");
        
        System.out.println("Novo salário: " + funcionario.getSalario());
        System.out.println("Novo cargo: " + funcionario.getCargo());
    }
}
