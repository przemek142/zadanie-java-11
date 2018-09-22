import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(0,0);
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj X");
        point.setX(scan.nextDouble());
        scan.nextLine();
        System.out.println("Podaj Y");
        point.setY(scan.nextDouble());
        scan.nextLine();

        System.out.printf(point.quadrandCheck());

    }
}
