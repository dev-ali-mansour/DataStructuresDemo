import java.util.ArrayList;
import java.util.Scanner;

/**
 * DataStructuresDemo Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- DataStructuresDemo IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Students Sector");
        ArrayList students = new ArrayList<String>();

        char ch = 'y';
        do {
            System.out.print("Enter student name: ");
            students.add(scanner.nextLine());
            System.out.print("Add another student?: ");
            ch = scanner.next().charAt(0);
            scanner.nextLine();
        } while (ch == 'y' || ch == 'Y');
        System.out.println("================================");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student No " + (i + 1) + ": " + students.get(i));
        }
    }
}
