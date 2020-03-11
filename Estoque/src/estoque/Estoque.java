
package estoque;

public class Estoque {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Manteiga", 10.0, 2);
        
        Produto p2 = new Produto(p1);
        p2.setNome("Martelo");
        
        p1.status();
        p2.status();
    }
    
}
