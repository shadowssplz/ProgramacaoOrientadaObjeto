public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Maria", 30, "Feminino", 1.65, 60, "Asma", "Dipirona");
        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("Idade: " + paciente1.getIdade());
        System.out.println("Sexo: " + paciente1.getSexo());
        System.out.println("Altura: " + paciente1.getAltura());
        System.out.println("Peso: " + paciente1.getPeso());
        System.out.println("Histórico Médico: " + paciente1.getHistoricoMedico());
        System.out.println("Medicamentos: " + paciente1.getMedicamentos());
        
        paciente1.setAltura(1.70);
        paciente1.setPeso(65);
        paciente1.setMedicamentos("Fluoxetina, Lorazepam");
        
        System.out.println("Nova altura: " + paciente1.getAltura());
        System.out.println("Novo peso: " + paciente1.getPeso());
        System.out.println("Novos medicamentos: " + paciente1.getMedicamentos());
    }
}
