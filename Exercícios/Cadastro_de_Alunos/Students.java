package Exercícios.Cadastro_de_Alunos.src;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Student{

    public static final int MAX_GRADE = 2;

    String studentName;
    int studentID;
    float[] semesterGrade = new float[MAX_GRADE];
    float avarageGrade;

    public Student(String name, int ID, float[] grades, float avg){
        this.studentName = name;
        this.studentID = ID;
        this.semesterGrade = grades;
        this.avarageGrade = avg;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();

        string.append("Nome: ").append(studentName).append(", ID: ").append(studentID);

        for(int i = 0; i<MAX_GRADE; i++){
            string.append(String.format(", %d° nota: %.1f", i+1, semesterGrade[i]));
        }

        string.append(", média: ").append(avarageGrade);

        return string.toString();
    }
}

class studentsPrinter{
    public static void printStudent(List<Student> studentList){
        for(Student aluno: studentList){
            System.out.println(aluno);
        }
    }
}

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

        studentsPrinter.printStudent(studentList);
    }
}
