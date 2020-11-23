import java.util.Scanner;

/**
 * DataStructuresDemo Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- DataStructuresDemo IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Main {
    private static String students[];

    public static void main(String[] args) {

//        Data data = new Data();
//
//        data.setData();
//
//        data.printData();


//        int size = 0;
//        System.out.print("Enter students number: ");
//        Scanner scanner = new Scanner(System.in);
//        size = scanner.nextInt();
//        scanner.nextLine();
//        students = new String[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter student name: ");
//            students[i] = scanner.nextLine();
//            setData(i, scanner.nextLine());
//        }
//        System.out.println("=======================");
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("Student No " + (i+1) + " name: " + students[i]);
//        }
//        System.out.println("=======================");

//        System.out.print("Enter Users number: ");
//        Scanner scanner = new Scanner(System.in);
//        User users[] = new User[scanner.nextInt()];
//        scanner.nextLine();
//        for (int i = 0; i < users.length; i++) {
//            System.out.print("Enter username: ");
//            String username = scanner.nextLine();
//            System.out.print("Enter password: ");
//            String password = scanner.nextLine();
//            User user = new User(username, password);
//            users[i] = user;
//        }
//        System.out.println("===========================");
//        for (int i = 0; i < users.length; i++) {
//            User currentUser = users[i];
//            currentUser.setUserName(currentUser.getUserName() + "@google.com");
//            System.out.println("User No " + (i + 1) + ": Username: " + currentUser.getUserName()
//                    + ", Password: " + currentUser.getPassword());
//        }

//        Cube<Integer> cube = new Cube<>();
//        cube.setHeight(10);
//        cube.setWidth(5);
//        cube.setHeight(2);
//
//        Cube<Double> doubleCube = new Cube<>();
//        doubleCube.setHeight(5.2);
//        doubleCube.setWidth(6.5);
//        doubleCube.setLength(4.2);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int first = scanner.nextInt();
//        System.out.print("Enter second number: ");
//        int second = scanner.nextInt();
//        try {
//            System.out.println("Connection to database has been opened");
//            checkNumber(first);
//            float result = first / second;
//            System.out.println("Result = " + result);
//        } catch (ArithmeticException e) {
////            System.out.println(e.getLocalizedMessage());
//            System.out.println("You cant divide number by zero!");
//        } catch (Exception e) {
//            System.out.println(e.getLocalizedMessage());
//        } finally {
//            System.out.println("connection to database has been closed");
//        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        try {
            validatePassword(password);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
    }

//    public static void checkNumber(int number) throws Exception {
//        if (number % 2 != 0) throw new Exception("This number must be even");
//    }

    public static void validatePassword(String password) throws Exception {
        if (password.isEmpty()) throw new Exception("Required field!");
    }

    public static void setData(int index, String studentName) {
        students[index] = studentName;
    }
}
