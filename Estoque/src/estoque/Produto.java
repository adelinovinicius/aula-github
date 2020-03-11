
package estoque;

public class Produto {
    private String nome;
    private Double peso;
    private int quantidade;

    public Produto(String nome, Double peso, int quantidade) {
        this.nome = nome;
        this.peso = peso;
        this.quantidade = quantidade;
    }
    
    //COPY CONSTRUCTOR
    public Produto (Produto p){
        this(p.nome, p.peso, p.quantidade);
    }
    ////////////////////////////////////
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        if(!nome.isEmpty())
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if(peso>0)
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade>=0)
        this.quantidade = quantidade;
    }
    
    public void status(){
        System.out.println("O produto chama " + this.getNome());
        System.out.println("O produto pesa " + this.getPeso() + " Kg");
        System.out.println("Temos " + this.getQuantidade() + " produtos");
        System.out.println("\n");
               
    }
}
