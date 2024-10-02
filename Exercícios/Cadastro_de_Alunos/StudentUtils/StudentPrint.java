package Exercícios.Cadastro_de_Alunos.StudentUtils;

import Exercícios.Cadastro_de_Alunos.StudentsStruct.Student;
import java.util.List;


public class StudentPrint {
    public static void printStudent(List<Student> studentList){
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
