package aula11;

public class Aula11 {

    public static void main(String[] args) {
        
        Visitante v = new Visitante(18, "Maria", 'F');
        
        System.out.println(v.toString());
        v.fazerAniversário();
        System.out.println(v.toString());
        
        Professor p = new Professor("Mestre", 4500, 29, "Fulano", 'M');
        
        System.out.println(p.toString());
        
        p.aumento(5000);
        
        System.out.println(p.toString());
    }
    
}
