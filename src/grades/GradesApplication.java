package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Gene");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);
        Student student2 = new Student("paul");
        student2.addGrade(85);
        student2.addGrade(90);
        student2.addGrade(83);
        Student student3 = new Student("joe");
        student3.addGrade(90);
        student3.addGrade(92);
        student3.addGrade(83);
        Student student4 = new Student("jeff");
        student4.addGrade(70);
        student4.addGrade(69);
        student4.addGrade(2);
        students.put("github1", student1);
        students.put("github2", student2);
        students.put("github3", student3);
        students.put("github4", student4);


        System.out.println("Welcome!");
        System.out.println("Here are a list of the github users");
        System.out.println(students.keySet());

        Input input = new Input();

        do {
            System.out.println("What student would you like to see more information on?");
            String myInput = input.getString();
            if (students.containsKey(myInput)){
                getInfo(myInput, students);
            }  else {
                System.out.println("Sorry, no student found with the github username of  \"" + myInput +"\"");
            }

            System.out.println("Would you like to continue?");

        } while (input.yesNo());

        System.out.println("Goodbye, and have a wonderful day!");



    }


    public static void getInfo(String myInput, HashMap<String, Student>  students){
        System.out.println("Student is: " + students.get(myInput).getName());
        System.out.println("There grades are: " + students.get(myInput).getGrades());
        System.out.println("Average is: " + students.get(myInput).getGradeAverage());

    }
}
