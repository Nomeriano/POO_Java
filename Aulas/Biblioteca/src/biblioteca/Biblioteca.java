package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        
        p[0] = new Pessoa("Maria", 'F', 15);
        p[1] = new Pessoa("Fulano", 'M', 18);
        
        Livro [] l = new Livro[3];
        l[0] = new Livro("POO", "Pedro", 50, p[0]);
        l[1] = new Livro("C++", "Ciclano", 100, p[1]);
        
        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].avancarPagina();
        l[0].avancarPagina();
        l[0].avancarPagina();
        System.out.println(l[0].detalhes());
        
        
    }
    
}
