package Exercícios.Cadastro_de_Funcionarios.EmployeeUtils;

import Exercícios.Cadastro_de_Funcionarios.EmployeeStruct.Funcionario;

import java.util.Scanner;

import java.util.List;
public class EmployeeUtils{
    public static void employeePrinter(List<Funcionario> employeeList){
        for(Funcionario funcionario : employeeList){
            System.out.println(funcionario);
        }
    }

    public static class InputManager{
        private Scanner scanner;

        public InputManager(Scanner leitor){
            this.scanner = leitor;
        }

        public String getEmployeeName(int employeeQuantity){
            System.out.print(String.format("Digite o nome do %d° funcionário: ", employeeQuantity));
            return scanner.nextLine();
        }

        public int getEmployeeID(String EmployeeName){
            int EmployeeID;
            do {
                System.out.print(String.format("Digite o ID pertencente ao funcionário %s: ", EmployeeName));
                while(!scanner.hasNextInt()){
                    System.out.println("ERRO! Coloque um número inteiro.");
                    scanner.next();
                }
                EmployeeID = scanner.nextInt();
                scanner.nextLine();
            } while(EmployeeID < 0);
            return EmployeeID;
        }
        
        public float getEmployeeWage(String EmployeeName){
            float employeeWage;
            do{
                System.out.print(String.format("Digite o salário do funcionário %s: ", EmployeeName));
                while(!scanner.hasNextFloat()){
                    System.out.println("ERRO! Digite um salário válido!");
                    scanner.next();
                }
                employeeWage = scanner.nextFloat();
                scanner.nextLine();
            } while(employeeWage < 0);
            return employeeWage;
        }
    }

    public class RegisterEmployee{
        public static void RegisterNewEmployee(List<Funcionario> employeeList, int employeeQuantity, Scanner leitor){

            InputManager inputmanager = new InputManager(leitor);

            for(int i=0; i<employeeQuantity; i++){
                leitor.nextLine();
                String employeeName = inputmanager.getEmployeeName(i+1);
                int employeeID = inputmanager.getEmployeeID(employeeName);
                float employeeWage = inputmanager.getEmployeeWage(employeeName);
                employeeList.add(new Funcionario(employeeName, employeeID, employeeWage));
            }
        }
    }
}
