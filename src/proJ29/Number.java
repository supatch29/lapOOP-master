package proJ29;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Please insert 3 different integer numbers : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if (x>y && y>z)
        {
            System.out.println("Number one is the largest");
        }
        else if (y>x && y>z)
        {
            System.out.println("Number two is the largest");
        }
        else if (z>x && z>y)
        {
            System.out.println("Number three is the largest");
        }
        else
        {
            System.out.println("These numbers are the same");
        }
    }
}