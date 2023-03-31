import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpId = in.nextInt();
        String Department = in.next();

        switch (EmpId) {
            case 1 -> System.out.println("xyz");
            case 2 -> System.out.println("pqr");
            case 3 -> {
                switch (Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Managing Department");
                    default:
                        System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter valid EmpId");
        }
    }
}
