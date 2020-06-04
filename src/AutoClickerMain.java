import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;

public class AutoClickerMain {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A/C");
        int useClicker;

        do {

            System.out.println("Enter the number of desired clicks: ");
            int clicks = scanner.nextInt();

            System.out.println("Enter the delay in ms");
            int delay = scanner.nextInt();
            System.out.println();

            System.out.println("Program will start in 3 seconds.");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            AutoClicker clicker = new AutoClicker();
            clicker.setDelay(delay);

            for (int i = 0; i < clicks; i++) {
                clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
            }

            System.out.println("A/C has finished the task");
            useClicker = getUseClicker(scanner);
        } while (useClicker == 1);
    }

    private static int getUseClicker(Scanner scanner) {
        System.out.println("Use AC? 1 yes, 2 exit");
        return scanner.nextInt();
    }

}
