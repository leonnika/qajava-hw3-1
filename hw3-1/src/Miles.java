
import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите цену вашего билета: ");
        int ticketPrice = input.nextInt();
        int milesNumber = (ticketPrice / 20);
        System.out.print("Число миль которое Вам начисленно: " + milesNumber);
    }
}