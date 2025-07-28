import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Enter a number to compute even or odd: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] compute = {"Even", "Odd"};
        System.out.println(compute[num % 2 ]);
    }
}