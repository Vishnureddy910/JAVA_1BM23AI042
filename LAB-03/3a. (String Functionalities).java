package BM23AI042;

import java.util.Scanner;
import java.io.PrintStream;

public class Strings {
    public Strings() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        PrintStream var10000 = System.out;
        boolean var10001 = str1.equals(str2);
        var10000.println("Equals (case-sensitive): " + var10001);
        System.out.println("Equals (case-insensitive): " + areEqualIgnoreCase);
        var10000 = System.out;
        String var7 = str1.concat(str2);
        var10000.println("Concatenated: " + var7);
        String copy1 = String.valueOf(str1);
        System.out.println("Copy of str1: " + copy1);
        scanner.close();
    }
}
