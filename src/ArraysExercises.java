import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Aziz");
        people[1] = new Person("Landon");
        people[2] = new Person("Shawn");
        for (Person person : people){
            System.out.println(person.getName());
        }

        System.out.println("------");

        Person[] newArrayOfPeople = addPerson(people, "david");


        for (int i = 0; i < newArrayOfPeople.length; i++){
            System.out.println(newArrayOfPeople[i].getName());
        }

        System.out.println("------");

        Person[] newestArrayOfPeople = addPerson(newArrayOfPeople, "sally");


        for (int i = 0; i < newestArrayOfPeople.length; i++){
            System.out.println(newestArrayOfPeople[i].getName());
        }

    }




    public static Person[] addPerson(Person[] people, String userInput){
        Person[] newArrayOfPeople = new Person[people.length + 1];
        for(int i=0; i<(people.length); i++){
            newArrayOfPeople[i] = people[i];
        }
        Person newPerson = new Person(userInput);
        newArrayOfPeople[people.length] = newPerson;
        return  newArrayOfPeople;
    }
}
