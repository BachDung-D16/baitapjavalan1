
package baitapjava;
import java.util.Scanner;
public class bai3 {
    public static int Nhap()
    {
        Scanner nhap = new Scanner (System.in);
        boolean check = false;
        int t=0;
        while (!check)
        {
           try
           {
               t = nhap.nextInt();
               check = true;
           }
           catch (Exception e1)
           {
               System.out.println("Ban nhap sai , moi ban nhap lai:");
           }
           
        }
        return (t);
    }
    public static void PhanTich( int n)
    {
        for (int i=2; i<=n; )
        {
            if (i==n)
            {
                System.out.print(n);
                break;
            }
            if (n%i==0)
            {
                System.out.print(i+" X ");
                n/=i;
            }
            else
            {
                i++;
            }
        }
                
    }
    public static void main (String [] args )
    {
        System.out.println("Moi ban nhap n:");
        int n = Nhap();
        System.out.print("n= " ); 
        PhanTich(n);
    }
}
