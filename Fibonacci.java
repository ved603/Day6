package Day6;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int sec = 1;
        int temp = 0;
        System.out.println("The Fibonacci Series is : ");
        System.out.print(first+ " ");
        System.out.print(sec+ " ");
        while(temp<=1000){
            temp = first + sec;
            System.out.print(temp+ " ");
            first = sec;
            sec = temp;
        }
    }
}
