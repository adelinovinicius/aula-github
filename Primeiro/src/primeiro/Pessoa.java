package primeiro;

public class Pessoa 
{
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
   public void setNome(String valNome)
    {
        if(!valNome.isEmpty())
            nome = valNome;
    }
    
    public String getNome()
    {
        return nome;
    }

    public String getSobrenome() 
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) 
    {
        if(!sobrenome.isEmpty())
           this.sobrenome = sobrenome;
    }
    
    public void print()
    {
        System.out.println(nome + " " + sobrenome);
    }
} 
