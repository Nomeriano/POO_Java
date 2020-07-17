package aula11;

public class Aluno extends Pessoa{
   protected String curso;
   protected int matricula;

    public Aluno(String curso, int matricula, int idade, String nome, char sexo) {
        super(idade, nome, sexo);
        this.curso = curso;
        this.matricula = matricula;
    }
   
   public void pagarMensalidade(){
       System.out.println("Pagando mensalidade do aluno: " + this.nome);
   }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
