package aula11;

public abstract class Pessoa { // Está casse é abstrata e não pode ser instânciada! 
    protected int idade;
    protected String nome;
    protected char sexo;

    public Pessoa(int idade, String nome, char sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public void fazerAniversário(){
        this.setIdade(this.getIdade() + 1);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + '}';
    }
    
    
}
