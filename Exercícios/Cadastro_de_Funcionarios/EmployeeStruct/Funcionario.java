package Exercícios.Cadastro_de_Funcionarios.EmployeeStruct;

public class Funcionario{
    private String name;
    private int ID;
    private float wage;

    public Funcionario(String name, int ID, float wage){
        this.name = name;
        this.ID = ID;
        this.wage = wage;
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s, ID: %d, Salário: %.2f", name, ID, wage);
    }
}