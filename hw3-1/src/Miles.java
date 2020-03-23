
import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int TicketPrice;

        System.out.print("Введите цену вашего билета: ");
        TicketPrice = vvod.nextInt();
        // int MilesNumber = Math.round (TicketPrice / 20);

        int MilesNumber =  (TicketPrice / 20);

        System.out.print("Число миль которое Вам начисленно: " + MilesNumber);
    }
}