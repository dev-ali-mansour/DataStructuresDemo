/**
 * DataStructuresDemo Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- DataStructuresDemo IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int numbers[][] = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                numbers[i][j] = i * j;
            }
        }

        System.out.println("Lucky number is "+ numbers[4][3]);
    }
}
