import java.util.Scanner;

public class reverse_string {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rstr = "";
        System.out.println("String Entered is: " + str);
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr = rstr + str.charAt(i);
        }
        System.out.println("Reverse String is: " + str + " | " + rstr);
    }

}
