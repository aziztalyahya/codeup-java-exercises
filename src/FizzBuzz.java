public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1; i< 100; i++){
            System.out.println(i + " ");
            if (i % 3 == 0){
                System.out.println("fizz");
            }
            if (i % 5 == 0){
                System.out.println("buzz");
            }
            if (i % 5 == 0 && i % 3 == 0){
                System.out.println("fizzbuzz");
            }
        }
    }
}
