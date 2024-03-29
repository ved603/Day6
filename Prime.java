package Day6;
import java.util.Scanner;
public class Prime {
    public static boolean prime(int x){
        if(x == 1 || x == 0){
            return false;
        }

        if(x == 2 || x == 3){
            return true;
        }

        if(x%2 == 0 || x%3 == 0){
            return false;
        }

        for(int i=5;i*i<=x; i=i+6){
            if(x % i == 0 || x %(i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x = sc.nextInt();
        sc.close();
        if(prime(x)){
            System.out.println("The Given Number is a Prime Number");
        }
        else{
            System.out.println("The Given Number is NOt a Prime Number ");
        }    
    }
}
