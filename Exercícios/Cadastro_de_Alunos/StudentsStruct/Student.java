package Exercícios.Cadastro_de_Alunos.StudentsStruct;

import Exercícios.Cadastro_de_Alunos.Students;

public class Student {

    public static final int MAX_GRADE = 2;

    String studentName;
    int studentRA;
    float[] studentSemesterGrade = new float[MAX_GRADE];
    float studentGradesAvarage;

    public Student(String name, int RA, float[] grades, float avarage){
        this.studentName = name;
        this.studentRA   = RA;
        this.studentSemesterGrade = grades;
        this.studentGradesAvarage = avarage;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Nome: ").append(studentName)
            .append("RA: ").append(studentRA);

        if(studentSemesterGrade.length > 0){
            for(int i = 0; i<MAX_GRADE; i++){
                sb.append(String.format(", %d° nota: %.1f", i+1, studentSemesterGrade[i]));
            }
        } else {
            sb.append(", Estudante não tem notas ainda ");
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Student obj = new Student("PEDRO", 1982, new float[]{2.3f, 29f}, MAX_GRADE);
        String avocado = obj.toString();

        System.out.println(avocado);
    }
}
