package proJ24;

public class ForthPattern {
    public static void main(String[] args)
    {
        int x,y;
        for (x=1;x<=7;x++)
        {
            for (y=1;y<x;y++)
            {
                System.out.println("+");
            }
            System.out.println();
        }
    }
}
