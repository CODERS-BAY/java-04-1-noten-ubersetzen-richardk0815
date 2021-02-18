import java.util.Scanner;

public class notenUebersetzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int note = scanner.nextInt();

        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht genügend");
                break;
            default:
                System.out.println("Falsche Eingabe");

        }
    }
}
