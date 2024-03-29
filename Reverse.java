package Day6;
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        sc.close();
        int sum = 0;
        while(x > 0){
            int rem = x % 10;
            sum = (sum *10) + rem;
            x /= 10;
        }
        System.out.println("The Reverse of the Number is : " +sum);
    }
}