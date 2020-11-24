import java.util.Scanner;

/**
 * DataStructuresDemo Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- DataStructuresDemo IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class CheckCharacter {
    public static void main(String[] args) {
        char vowels[] = {'a', 'o', 'u', 'i', 'e'};
        System.out.print("Enter character: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        boolean isVowel = false;
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                isVowel = true;
            }
        }
        if (isVowel) System.out.println("Character "+ch+" is vowel");
        else System.out.println("Character "+ch+" is consonant");
    }
}
