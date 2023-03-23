import java.util.Date;

public class Funcionario {
    
    private String nome;
    private double salario;
    private Date dataAdmissao;
    private String cargo;
    private String departamento;
    
    public Funcionario(String nome, double salario, Date dataAdmissao, String cargo, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.departamento = departamento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
