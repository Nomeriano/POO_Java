package lutador;

import java.util.Random;

public class Luto {
    private Lutador desafiado;
    private Lutador desafiante;
    private int raudns;
    private boolean aprovado;

    public Luto() {

    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && !l1.getNome().equals(l2.getNome())){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if(isAprovado()){
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            System.out.println("------------ Desafiado --------------");
            this.desafiado.apresentar();
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(3);
            if(!this.getDesafiado().getNome().equals(this.getDesafiante().getNome())){
                if(this.getDesafiado().getCategoria().equals(this.getDesafiado().getCategoria())){
                    switch(num){
                        case 0: 
                            System.out.println("Empatou! ");
                            this.desafiado.empatarLuta();
                            this.desafiante.empatarLuta();
                            break;
                        case 1:
                            System.out.println("Venceu: " + this.desafiante.getNome());
                            this.desafiado.perderLuta();
                            this.desafiante.ganharLuta();
                            break;
                        case 2:
                            System.out.println("Venceu: " + this.desafiado.getNome());
                            this.desafiado.ganharLuta();
                            this.desafiante.perderLuta();
                            break;
                    }
                }else{
                    System.out.println("Lutadores com categorias diferentes! ");
                }
                    
            }else{
                System.out.println("Não tem como um lutador lutar com ele mesmo! ");
            }
        }else{
            System.out.println("A luta não foi aprovada! ");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRaudns() {
        return raudns;
    }

    public void setRaudns(int raudns) {
        this.raudns = raudns;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void imprime() {
        System.out.println("Desafiante: " + this.getDesafiante().getNome());
        System.out.println("Desafiado: " + this.getDesafiado().getNome());
    }
        
    
}
