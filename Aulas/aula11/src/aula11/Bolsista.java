package aula11;

public class Bolsista extends Aluno{
    private String bolsa;

    public Bolsista(String bolsa, String curso, int matricula, int idade, String nome, char sexo) {
        super(curso, matricula, idade, nome, sexo);
        this.bolsa = bolsa;
    }
    
    @Override // sobrescreve o método da classe Aluno
    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista! pagamento facilitado ");
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
