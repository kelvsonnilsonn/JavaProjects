package Exercícios.Cadastro_de_Funcionarios;

import Exercícios.Cadastro_de_Funcionarios.EmployeeUtils.EmployeeUtils;
import Exercícios.Cadastro_de_Funcionarios.EmployeeStruct.Funcionario;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Employee {

    public static void main(String[] args){
        List<Funcionario> employeeList = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionarios: ");
        int employeeQuantity = leitor.nextInt();

        EmployeeUtils.RegisterEmployee.RegisterNewEmployee(employeeList, employeeQuantity, leitor);
        EmployeeUtils.employeePrinter(employeeList);
        leitor.close();
    }
}
