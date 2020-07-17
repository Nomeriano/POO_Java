package lutador;

public class Lutador implements AtributosLutador{
    private String nome, nacionalidade, categoria = "";
    private int idade, derrotas, empates, vitoria;
    private double altura, peso;

    public Lutador(String nome, String nacionalidade, int idade, int derrotas, int empates, int vitoria, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.derrotas = derrotas;
        this.empates = empates;
        this.vitoria = vitoria;
        this.altura = altura;
        this.peso = peso;
        this.setCategoria();
    }

    @Override
    public void apresentar() {
        System.out.println("--------------------------------------------");
        System.out.println("\nNome: " + this.getNome() + "\nNacionalidade: " + this.getNacionalidade() + "\nIdade: " + this.getIdade()
        + "\nAltura: " + this.getAltura() + "\nPeso: " + this.getPeso() + "\nCategoria: " + this.getCategoria());
        status();
    }

    @Override
    public void status() {
        System.out.println("Vitória: " + this.getVitoria());
        System.out.println("Empate: " + this.getEmpates());
        System.out.println("Derrota: " + this.getDerrotas());
    }

    @Override
    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52){
            this.categoria = "Invalido";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120){
            this.categoria = "Peseado";
        }else{
            this.categoria = "inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
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
        this.setCategoria();
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
    
    
    
}
