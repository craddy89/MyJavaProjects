package IO;

import java.util.Scanner;

public class S1mpleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String str = scanner.next();

        scanner = new Scanner(System.in);
        String str2 = scanner.nextLine();

        System.out.println("Number " + i + " " + "Float " + f + " " + "Word " + str + " " + "Line " + str2);

    }
}
