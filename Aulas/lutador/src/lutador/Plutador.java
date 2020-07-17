package lutador;

public class Plutador {

    public static void main(String[] args) {
        Lutador n[] = new Lutador[5]; // Cria um vetor com 5 Lutadoes
        
        n[0] = new Lutador ("Fulano", "Br", 18, 1, 5, 5, 2, 90);
        n[1] = new Lutador ("Ciclano", "Br", 18, 1, 5, 5, 2, 90);
        
        Luto l = new Luto();
        //n[0].apresentar();
        //n[1].apresentar();
        //l.lutar();
        
        l.marcarLuta(n[0], n[1]);
        l.lutar();
        //l.imprime();
    }
    
}
