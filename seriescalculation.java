import java.util.Scanner;

public class seriescalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Number of queries
        int q = scanner.nextInt();
        
        for (int i = 0; i < q; i++) {
            // Input: a, b, and n for each query
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int sum = a;
            
            // Calculate and print the series
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println(); // Move to next line for the next query
        }
        scanner.close();
    }
}