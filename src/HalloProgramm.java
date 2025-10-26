import java.util.Scanner;

public class HalloProgramm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gib deinen Namen ein: ");
        String name = scanner.nextLine();

        System.out.print("Bitte gib dein Alter ein: ");
        int alter = scanner.nextInt();

        System.out.println("Hallo " + name + "! Du bist " + alter + " Jahre alt.");
        System.out.println("Willkommen zu meinem ersten Java-Projekt auf GitHub!");
    }
}
