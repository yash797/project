import java.util.Scanner;

public class calci {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multipication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int i = s.nextInt();

            // System.out.println("ENTER FIRST NUMBER ");
            // int a = s.nextInt();

            System.out.println("ENTER SECOND NUMBER ");
            int b = s.nextInt();
            int a=result;
            // 'result' will store the result of operation
            
            switch (i) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
                case 5:
                    System.out.println("Exited Successfully!.");
                    
                    System.exit(0);

                default:
                    System.out.println("Wrong Choice.");

            }

            System.out.println("Answer is " + result);

            System.out.println("Go again?");
            String goAgain = s.next();
            if (!goAgain.equals("y")) {
                break;
            }

        }
    }
}