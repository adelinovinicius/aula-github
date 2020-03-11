
package cartesiano;

public class Ponto {
    private double x,y;

    //Padrão
    public Ponto() {
        setX(0);
        setY(0);
    }
 
    //Com Parâmetros
    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }
    
    //Copy Constructor
    public Ponto (Ponto p){
        this(p.x, p.y);
    }
    
    //Retorna a distancia do ponto até as coordenadas indicadas nos parâmetros
    
    public double distance (double x, double y){
      
        double dx = x-this.x;
        double dy = y-this.y;
        
        double dist = Math.sqrt(dx*dx + dy*dy);
        
        return dist;
    }
  
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto é " + "X= " + x + ", Y= " + y ;
    }
 
    public void print(){
        System.out.println("O valor do " + toString());
        //System.out.println("\n");
               
    }
    
}
