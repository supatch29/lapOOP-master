package proJ39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        int x[] = new int[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please inert Array numbers : ");
        for (int y=0;y<7;y++)
        {
            x[y] = Integer.parseInt(br.readLine());
        }
        for (int y=0;y<x.length;y++)
        {
            System.out.println(" " + x[y]);
        }
    }
}
