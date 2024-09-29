package Exercícios.Cadastro_de_Funcionarios.src;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Funcionario{
    String name;
    int ID;
    float wage;

    public Funcionario(String name, int ID, float wage){
        this.name = name;
        this.ID = ID;
        this.wage = wage;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s, ID: %d, Salário: %.3f", name, ID, wage);
    }
}

class EmployeePrinter{
    public static void printEmployeers(List<Funcionario> employeeLists){
        for(Funcionario funcionario : employeeLists){
            System.out.println(funcionario);
        }
    }
}

class RegisterNewEmployee{
    public static void registerEmployer(List<Funcionario> employeeList ,int employeeQuantity){

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i<employeeQuantity; i++){

            System.out.print(String.format("Digite o nome do %d° funcionario: ", i+1));
            String employeeName = leitor.nextLine();
        
            int employeeID;
            do{
                System.out.print(String.format("Digite o ID do %d° funcionario: ", i+1));

                while (!leitor.hasNextInt()){
                    System.out.println("ID INVÁLIDO! Tente novamente."); // Tratamento de erro caso ID INVÁLIDO.
                    leitor.next();
                }

                employeeID = leitor.nextInt();
            } while(employeeID < 0);

            float employeeWage;
            do{
                System.out.print(String.format("Digite o salário do funcionario %s: ", employeeName));
                
                while(!leitor.hasNextFloat()){
                    System.out.println("SALÁRIO INVÁLIDO! Tente novamente."); // Tratamento de erro caso SALÁRIO INVÁLIDO.
                    leitor.next();
                }

                employeeWage = leitor.nextFloat();
            } while(employeeWage < 0);

            employeeList.add(new Funcionario(employeeName, employeeID, employeeWage));

            leitor.nextLine();
        }
    }
}

public class Employee {
    public static void main(String[] args){
        List<Funcionario> employeeList = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionarios: ");
        int employeeQuantity = leitor.nextInt();

        RegisterNewEmployee.registerEmployer(employeeList, employeeQuantity);
        EmployeePrinter.printEmployeers(employeeList);
        leitor.close();
    }
}
