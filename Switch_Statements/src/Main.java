import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        //Using if Condition
//        if(fruit.equals("mango")){
//            System.out.println("King of fruits");
//
//        }
//        if(fruit.equals("apple")){
//            System.out.println("Delicious");
//        }

        //using switch statements
        //Enhanced version
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Delicious");
            case "banana" -> System.out.println("Good for health");
            default -> System.out.println("please enter valid fruit");
        }

    }
}