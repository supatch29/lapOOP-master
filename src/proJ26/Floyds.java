package proJ26;

import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        int x,num1 = 1,y,z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert number of rows : ");

        x = sc.nextInt();
        System.out.println("Result of Flotds Triangle is : ");
        for (y=1;y<=x;y++)
        {
            for (z=1;z<=y;z++)
            {
                System.out.println(num1 + " ");
            }
            System.out.println();
        }
    }
}