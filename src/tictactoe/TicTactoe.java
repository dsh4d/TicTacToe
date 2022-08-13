package tictactoe;

import java.util.Scanner;

public class TicTactoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String table = scanner.next();

        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", table.charAt(0), table.charAt(1), table.charAt(2));
        System.out.printf("| %c %c %c |\n", table.charAt(3), table.charAt(4), table.charAt(5));
        System.out.printf("| %c %c %c |\n", table.charAt(6), table.charAt(7), table.charAt(8));
        System.out.println("---------");
    }
}
