package proJ30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {
    public static void main(String[] args) throws IOException {
        int x,y,z,xyz = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first number : ");
        x = Integer.parseInt(br.readLine());
        System.out.println("Please enter second number : ");
        y = Integer.parseInt(br.readLine());

        while (xyz!=6)
        {
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Multipalication");
            xyz = Integer.parseInt(br.readLine());
            switch (xyz)
            {
                case 1:
                    z = x+y;
                    System.out.println("Result of Additon is : " + z);
                    break;
                case 2:
                    z = x-y;
                    System.out.println("Result of Subtraction is L " + z);
                    break;
                case 3:
                    z = x/y;
                    System.out.println("Result of Division is : " + z);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}