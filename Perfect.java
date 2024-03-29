package Day6;
import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=1;i<=x/2;i++){
            if(x%i == 0){
                sum += i;
            }
        }
        if(x == sum){
            System.out.println("The Given Number is a Perfect Number");
        }
        else{
            System.out.println("The Given Number is Not a Perfect Number ");
        }
    }
}
