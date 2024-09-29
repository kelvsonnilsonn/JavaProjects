package Exercícios.Cadastro_de_Funcionarios;

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

class InputManager{
    private Scanner scanner;

    public InputManager(Scanner leitor){
        this.scanner = leitor;
    }

    public String getEmployeeName(int employeeNumber){
        System.out.print(String.format("Digite o nome do %d° funcionário: ", employeeNumber + 1));
        return scanner.nextLine();
    }

    public int getEmployeeID(int employeeNumber){
        int employeeID;
        do {
            System.out.print(String.format("Digite o ID do %d funcionário: ", employeeNumber));
            while(!scanner.hasNextInt()){
                System.out.println("ERRO DO ID! Tente novamente.");
                scanner.next();
            }
            employeeID = scanner.nextInt();
        } while (employeeID < 0);
        scanner.nextLine();
        return employeeID;
    }

    public float getEmployeeWage(String employeeName){
        float employeeWage;
        do {
            System.out.print(String.format("Digite o salário do funcionario %s: ", employeeName));
            while(!scanner.hasNextFloat()){
                System.out.println("ERRO DO SALÁRIO! Tente novamente.");
                scanner.next();
            }
            employeeWage = scanner.nextFloat();
        } while(employeeWage < 0);
        return employeeWage;
    }
}

class RegisterNewEmployee{
    public static void registerEmployer(List<Funcionario> employeeList ,int employeeQuantity, Scanner leitor){

        InputManager inputmanager = new InputManager(leitor);

        for(int i = 0; i<employeeQuantity; i++){
            String employeeName = inputmanager.getEmployeeName(i);
            int employeeID = inputmanager.getEmployeeID(i);
            float employeeWage = inputmanager.getEmployeeWage(employeeName);
            employeeList.add(new Funcionario(employeeName, employeeID, employeeWage));
        }
    }
}

public class Employee {
    public static void main(String[] args){
        List<Funcionario> employeeList = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionarios: ");
        int employeeQuantity = leitor.nextInt();

        RegisterNewEmployee.registerEmployer(employeeList, employeeQuantity, leitor);
        EmployeePrinter.printEmployeers(employeeList);
        leitor.close();
    }
}
