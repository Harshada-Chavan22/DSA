import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nested Switch

        int empID = sc.nextInt();
        String dept = sc.next();

        switch (empID) {
            case 1:
                System.out.println("Harshada Chavan");
                break;
            case 2:
                System.out.println("Mohini Patil");
                break;
            case 3:
            System.out.println("Emp number 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "Management":
                        System.out.println("Management dept");
                        break;
                    default:
                        System.out.println("No dept");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct emp id");
                break;
        }
        // String fruit = sc.next();

        // switch (fruit) {
        //     case "mango":
        //         System.out.println("King of fruits");
        //         break;

        //     case "apple":
        //         System.out.println("a sweet red fruit");
        //         break;

        //     case "banana":
        //         System.out.println("yellow yellow dirty fellow");
        //         break;

        //     case "strawberry":
        //         System.out.println("a sweet and bitter fruit");    
        //         break;

        //     case "dragon":
        //         System.out.println("a animal fruit");  
        //         break;  

        //     default:
        //         System.out.println("Don't want fruit");
        //}

        // int day = sc.nextInt();
        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Invalid day");
    //}

    //Nested Switch 

    }
}
