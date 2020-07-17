package aula06;

public class ControleRemoto implements Controldador{ // Faz a implementação do m[étodos Controle
 
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() { // Método  contrutor 
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------------- Menu ---------------");
        System.out.println("Está ligado: " + this.isLigado());
        System.out.println("Está tocando: " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu... ");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(getVolume()+ 5 );
        }else{
            System.out.println("A tv não está ligada! ");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("A TV está desligada! ");
        }
        
    }

    @Override
    public void ligarMudo() {
        if(this.getVolume() > 0 || this.isLigado() ){
            this.setVolume(0);
        }else{
            System.out.println("A TV está desligada ou está com o volume = 0");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() || this.getVolume() == 0){
            setVolume(50);
        }else{
             System.out.println("A tv não está muda! ");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){ // Como negar uma boolean
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
}
