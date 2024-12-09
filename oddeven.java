import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)  // If the remainder is 0 then its even else odd.
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
