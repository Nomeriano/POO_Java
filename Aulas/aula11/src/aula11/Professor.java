package aula11;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public Professor(String especialidade, double salario, int idade, String nome, char sexo) {
        super(idade, nome, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    
    public void aumento(double valor){
        this.setSalario(this.getSalario() + valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    
}
