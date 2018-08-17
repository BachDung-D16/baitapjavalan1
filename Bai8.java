// liet ke so fibonaci nho hon n va la so nguyen to
package baitapjava;
import java.util.Scanner;
public class Bai8 {
    public static int Fibonaci(int n)
    {
        if (n == 0 || n==1)
        return n;
        else
        {
            return Fibonaci(n-1) + Fibonaci(n-2);
        }
    }
    public static boolean  checkNT (int n)
    {
        if (n<2){
            return false;
        }
        else
        {
             int t = (int) Math.sqrt(n);
            for (int i=2; i<t; i++)
            {
                if (n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main (String[] args)
    {
        System.out.println("Moi ban nhap n:");
        Scanner Nhap = new Scanner (System.in);
        int n = Nhap.nextInt();
        int i=0;
        System.out.println("Cac so thoa man la: ");
        while (Fibonaci(i)<n)
        {
            if (checkNT(Fibonaci(i)))
            {
                System.out.print(Fibonaci(i));
                System.out.println("\t");
            }
            i++;
        }
        
    }
    
}
