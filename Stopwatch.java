package Day6;
import java.util.Scanner;

public class Stopwatch {
    static Scanner sc = new Scanner(System.in);
    static volatile boolean running = true;
    static volatile boolean paused = false;
    static String userInput;

    public static void main(String[] args) {
        System.out.println("Press 'S' to start");
        userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("S")) 
        {
            startStopwatch();
        } 
        else 
        {
            System.out.println("Invalid input. Press 'S' to start, 'Q' to quit");
        }
    }
    private static void startStopwatch() {
        final long startTime = System.currentTimeMillis();
        final long[] elapsedTime = {0};
        final long[] pauseDuration = {0};
        Thread stopwatchThread = new Thread(() -> {
            while (running) {
                if (!paused) {
                    elapsedTime[0] = System.currentTimeMillis() - startTime - pauseDuration[0];
                }
                String timer = String.format("\rElapsed time: %02d:%02d:%02d:%03d ", elapsedTime[0] / 3600000, (elapsedTime[0] % 3600000) / 60000, (elapsedTime[0] % 60000) / 1000, elapsedTime[0] % 1000);
                System.out.println(timer);
            }});   
        stopwatchThread.start();  
        while (running) {
            userInput = sc.nextLine();
            {
                running = false;
                System.out.println("\nStopped");
            }
        }
    }   
    }
