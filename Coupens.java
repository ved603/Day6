package Day6;
import java.util.ArrayList;
import java.util.Random;

public class Coupens {

    public static int coupen(int count,ArrayList<Integer> a){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(200);
        if(a.contains(rand_int1)){
            count++;
            System.out.println("The Random Number Generated is : " +rand_int1);
            return coupen(count, a);
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 1;
        while(i<100){
            a.add(i);
            i++;
        }
        int count = 0;
        int b = coupen(count, a);
        System.out.println("The Count of Random Function is : " +b);
        
    }
}