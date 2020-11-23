/**
 * DataStructuresDemo Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- DataStructuresDemo IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Data {
    int numbers[] = new int[11];

    public void setData(){
        int result = 10;
        for (int i = 0; i <= 10; i++) {
            numbers[i] = result;
            result++;
        }
    }

    public void printData(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Number = " + numbers[i]);
        }
    }
}
