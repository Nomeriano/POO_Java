package aula02;
public class Aula02 {

    public static void main(String[] args) {
      Caneta c1 = new Caneta(); // Isso é uma instância
      c1.cor = "Azul";
      c1.ponta = 0.5;
      c1.tampar();
      c1.status();
      c1.rabiscar();
      
      Caneta c2 = new Caneta();
      
      c2.destampar();
      c2.cor = "Azul";
      c2.ponta = 0.5;
      c2.status();
      c2.rabiscar();
    }
    
}
