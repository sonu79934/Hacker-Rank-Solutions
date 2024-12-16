import java.util.Scanner;
public class javastdinstdout2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading inputs
        int integerValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline
        String stringValue = scanner.nextLine();
        
        // Printing outputs
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + integerValue);
        
        scanner.close();
    }
}