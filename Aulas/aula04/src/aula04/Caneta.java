package aula04;

public class Caneta { 
    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampar;

    public Caneta(String modelo, double ponta, String cor, boolean tampar) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampar = tampar;
    }
    
    public void tampar(){
        this.tampar = true;
    }
    
    public void destampar(){
        this.tampar = false;
    }
    
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.err.println("Ponta: " + this.getPonta());
        System.err.println("Cor: " + this.getCor());
        System.err.println("Tapada: " + this.isTampar());
    }

    public String getModelo() {
        return modelo;
    }

    public double getPonta() {
        return ponta;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampar() {
        return tampar;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampar(boolean tampar) {
        this.tampar = tampar;
    }
    
}
