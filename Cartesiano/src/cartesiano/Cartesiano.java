package cartesiano;

/*Representa um plano cartesiano de 2 dimensões

Faça 3 construtores para a classe Ponto

Padrão: Inicia o ponto nas coordenadas (0,0).
Com parâmetros: Recebe parâmetros para as coordenadas X e Y. 
Copy Constructor: Copia as coordenadas de outro ponto ja existente.
*/

public class Cartesiano {

    public static void main(String[] args) {
       
        Ponto p1, p2, p3;
        
        p1 = new Ponto();
        p1.print();
        
        p2 = new Ponto(3, 0);
        p2.print();
        
        p3 = new Ponto(p2);
        p3.print();
        
        double dist = p1.distance(3,4);
        
        System.out.println("dist = "+ dist);
        
    }
    
}
