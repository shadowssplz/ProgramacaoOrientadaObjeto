public class Paciente {
    
    private String nome;
    private int idade;
    private String sexo;
    private double altura;
    private double peso;
    private String historicoMedico;
    private String medicamentos;
    
    public Paciente(String nome, int idade, String sexo, double altura, double peso, String historicoMedico, String medicamentos) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.historicoMedico = historicoMedico;
        this.medicamentos = medicamentos;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getHistoricoMedico() {
        return historicoMedico;
    }
    
    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
    
    public String getMedicamentos() {
        return medicamentos;
    }
    
    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
}
