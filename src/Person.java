public class Person {
    private String name;

    public Person(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Person aziz = new Person("Aziz");
        aziz.sayHello();
        aziz.getName();
        Person shawn = new Person("Shawn");
        shawn.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
