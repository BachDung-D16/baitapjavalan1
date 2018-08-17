
package baitapjava;
import java.util.Scanner;
public class Bai2 {
    public static int Nhap()
    {
        Scanner Input = new Scanner (System.in);
        boolean check = false;
        int t=0;
        while (!check)
        {
           System.out.print("");
           try
           {
               t = Input.nextInt();
               check = true;
           }
           catch (Exception e1)
           {
               System.out.println("Moi ban nhap lai");
           }
        }
        return (t);
    }
    public static int TachSo(int n)
    {
        int t=0;
        while (n >0)
        {
           t = t + n% 10;
           n/=10;
        }
        return (t);
    }
    public static void main ( String[] args)
    {
        System.out.println("Nhap n: ");
        int n = Nhap();
        System.out.println("Tong la:"+TachSo(n));
    }
}
