import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapier {
    public static void main(String[] args) {

        // 0 = Schere, 1 = Stein, 2 = Papier
        Scanner eingabe = new Scanner(System.in);
        Random zufall = new Random();

        System.out.println("Wähle: 0 = Schere, 1 = Stein, 2 = Papier");
        int spieler = eingabe.nextInt();
        int computer = zufall.nextInt(3);

        System.out.println("Du: " + spieler + ",  Computer: " + computer);

        if (spieler == computer) {
            System.out.println("Unentschieden!");
        } else if (spieler == 1 && computer == 2 || spieler == 2 && computer == 0 || spieler == 0 && computer == 1) {
            System.out.println("Du hast leider verloren");
        } else {
            System.out.println("Du hast gewonnen! MEGA");

        }
    }


}
