package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName() {
            return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public int getGradeAverage(){
        Integer sum = 0;
        if(!grades.isEmpty()) {
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum.intValue() / grades.size();
        }
        return sum;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Aziz");
        student1.addGrade(50);
        student1.addGrade(100);
        student1.addGrade(150);
        System.out.println(student1.getName() + "'s average is: " + student1.getGradeAverage());
        System.out.println(student1.getGrades());



    }


}
