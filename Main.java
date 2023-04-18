import java.io.*;
import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {
    
    String command = "notepad.exe";
    static Scanner scan = new Scanner(System.in);

    public static void runTheSpaceBar() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int random = getRandomNumber();

        switch (random) {
            case 1:
                robot.keyPress(KeyEvent.VK_A);
                break;
            case 2:
                robot.keyPress(KeyEvent.VK_B);
                break;
            case 3:
                robot.keyPress(KeyEvent.VK_C);
                break;
            case 4:
                robot.keyPress(KeyEvent.VK_SPACE);
                break;
            case 5:
                robot.keyPress(KeyEvent.VK_ENTER);
                break;
            case 6:
                robot.keyPress(KeyEvent.VK_F);
                break;
            case 7:
                robot.keyPress(KeyEvent.VK_G);
                break;
            case 8:
                robot.keyPress(KeyEvent.VK_H);
                break;
            case 9:
                robot.keyPress(KeyEvent.VK_I);
                break;
            case 10:
                robot.keyPress(KeyEvent.VK_J);
                break;
            case 11:
                robot.keyPress(KeyEvent.VK_K);
                break;
            case 12:
                robot.keyPress(KeyEvent.VK_ENTER);
                break;
            case 13:
                robot.keyPress(KeyEvent.VK_M);
                break;
            case 14:
                robot.keyPress(KeyEvent.VK_N);
                break;
            case 15:
                robot.keyPress(KeyEvent.VK_O);
                break;
            case 16:
                robot.keyPress(KeyEvent.VK_P);
                break;
            case 17:
                robot.keyPress(KeyEvent.VK_Q);
                break;
            case 18:
                robot.keyPress(KeyEvent.VK_R);
                break;
            case 19:
                robot.keyPress(KeyEvent.VK_S);
                break;
            case 20:
                robot.keyPress(KeyEvent.VK_T);
                break;
            case 21:
                robot.keyPress(KeyEvent.VK_U);
                break;
            case 22:
                robot.keyPress(KeyEvent.VK_V);
                break;
            case 23:
                robot.keyPress(KeyEvent.VK_W);
                break;
            case 24:
                robot.keyPress(KeyEvent.VK_X);
                break;
            case 25:
                robot.keyPress(KeyEvent.VK_Y);
                break;
            case 26:
                robot.keyPress(KeyEvent.VK_Z);
                break;
            case 27:
                robot.keyPress(KeyEvent.VK_D);
                break;
            case 28:
                robot.keyPress(KeyEvent.VK_E);
                break;
            case 29:
                robot.keyPress(KeyEvent.VK_DELETE);
                break;
            case 30:
                robot.keyPress(KeyEvent.VK_L);
                break;
            default:
                robot.keyPress(KeyEvent.VK_SPACE);
                break;
        }

    }

    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        // String command = "notepad.exe";
        // Runtime run = Runtime.getRuntime();
        // run.exec(command);

        try {
            System.out.println(
                    "\n ██╗░░██╗██╗░░██╗░█████╗░████████╗██████╗░░█████╗░\n ██║░██╔╝██║░░██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗\n █████═╝░███████║███████║░░░██║░░░██████╔╝███████║\n ██╔═██╗░██╔══██║██╔══██║░░░██║░░░██╔══██╗██╔══██║\n ██║░╚██╗██║░░██║██║░░██║░░░██║░░░██║░░██║██║░░██║\n ╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝\n");
            System.out.println("\n Starting in \n 10 seconds");
            Thread.sleep(1000);
            for (int i = 9; i > 0; i--) {
                System.out.println("\n " + i + " seconds");
                Thread.sleep(1000);
            }
            System.out.println("\n Windows log off prevention started !!! \n Enjoy :D \n");
            System.out.println("\n Press 'CTRL+C' -> 'Y' -> 'ENTER' in the console to quit.\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean stillRunning = true;

        while (stillRunning) {
            runTheSpaceBar();
            Thread.sleep(1500);
        }
    }

    public static int getRandomNumber() {
        // define the range
        int max = 26;
        int min = 1;
        int range = max - min + 1;
        int random = 0;

        // generate random numbers within 1 to 10
        for (int i = 0; i < 26; i++) {
            int rand = (int) (Math.random() * range) + min;
            random = rand;
        }

        return random;

    }
}