import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int k = sc.nextInt();
        System.out.print("Enter second number: ");
        int p = sc.nextInt();
        int sum = k + p;
        System.out.println("Sum is: " + sum);
    }
}
