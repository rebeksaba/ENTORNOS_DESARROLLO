import java.util.Scanner;

public class Segurata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Dime tu edad:");
        int edad = Integer.parseInt(scanner.nextLine());

        if (edad >= 18) {
            System.out.println("Puedes pasar:");
        } else {
            System.out.println("you shall not pass:");
        }
    }

}
