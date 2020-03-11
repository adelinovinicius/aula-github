
package primeiro;

public class Funcionario extends Pessoa{
    
    private String cargo;
    private double salario;

    public Funcionario(String nome, String sobrenome, String cargo, double salario) {
        super(nome, sobrenome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void print(){
        System.out.println("Nome:" + getNome()+"   Sobrenome:"+getSobrenome() + 
                "   Cargo:" +getCargo()+ "   Salario:" +getSalario());
    }
    
}
