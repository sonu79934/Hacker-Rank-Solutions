import java.util.Scanner;
public class multiplicationtable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: read a single integer N
        int N = scanner.nextInt();

        // Constraints: Ensure N is within 2 and 20
        if (N >= 2 && N <= 20) {
            // Output: print the first 10 multiples of N
            for (int i = 1; i <= 10; i++) {
                int result = N * i;
                System.out.println(N + " x " + i + " = " + result);
            }
        } else {
            System.out.println("Input out of range! Please enter a value between 2 and 20.");
        }
        scanner.close();
    }
}