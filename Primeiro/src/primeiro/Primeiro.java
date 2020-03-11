package primeiro;

public class Primeiro {

    public static void main(String[] args) 
    {
        Pessoa ps;
        ps= new Pessoa("Jose", "Silva");
   
        ps.print();
        
        Funcionario f;
        f= new Funcionario("Maria", "Pereira", "Programadora", 10000);
        
        f.print();
    }
    
}
