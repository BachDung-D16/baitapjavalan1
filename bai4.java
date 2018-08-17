
package baitapjava;
import java.util.Scanner;
//import java.lang.Math;
public class bai4 {
    public static int Nhap()
    {
        Scanner nhap = new Scanner (System.in);
        int t;
        do{
            t = nhap.nextInt();
        }while (t==0 || t<2);
        return t;
    }
    public static boolean  Kiemtra(int n)
    {
        int t = (int) Math.sqrt(n);
        for (int i=2; i<=t; i++)
        {
            if (n % i == 0)
                return false;
            
        }
        return true;
    }
    public static void main( String [] args)
    {
        System.out.println("Moi ban nhap n:");
        int n = Nhap();
        System.out.println("Cac so nguyen to nho hon "+n+ " la:");
        for (int i=2 ; i<=n ; i++)
        {
            if (Kiemtra(i))
            {
                System.out.print("\t"+i);
            }
        }
    }
}
