package Exercícios.Cadastro_de_Alunos;
import java.util.Scanner;

import Exercícios.Cadastro_de_Alunos.StudentsStruct.Student;
import Exercícios.Cadastro_de_Alunos.StudentUtils.StudentPrint;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void main(String[] args){

        List<Student> studentList = new ArrayList<>(); // Isso cria uma lista (list é uma interface)
 
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos a serem registrados: ");
        int studentsQuatity = leitor.nextInt();

        for(int i = 0; i<studentsQuatity; i++){
            leitor.nextLine();
            
            float mediaAvg = 0;

            System.out.print("Digite o nome do estudante: ");
            String name = leitor.nextLine();

            System.out.print("Digite o ID do estudante: ");
            int id = leitor.nextInt();

            float[] grades = new float[Student.MAX_GRADE];
            for(int k = 1; k<=Student.MAX_GRADE; k++){
                System.out.print(String.format("Digite a %d° nota do aluno %s: ", k, name));
                float new_grade = leitor.nextFloat();
                grades[k-1] = new_grade;
                mediaAvg += new_grade/Student.MAX_GRADE;
            }
            
            studentList.add(new Student(name, id, grades, mediaAvg));
        
        }

        leitor.close();

        StudentPrint.printStudent(studentList);
    }
}
