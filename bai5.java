//liet ke so fibonaci thu n
package baitapjava;
import java.util.Scanner;
public class bai5 {
    public static int Nhap()
    {
        Scanner Nhap = new Scanner (System.in);
        int n;
        do{
            n = Nhap.nextInt();
        }while (n ==0 || n<0);
        return (n);
    }
    public static int Fibonaci(int n)
    {
        if ((n==1) || (n==2))
        {
            return 1;
        }
        else{
            int a[] = new int [n];
            a[0] = 1;
            a[1] = 1;
            for (int i=2; i<a.length; i++)
            {
                a[i] = a[i-1] + a[i-2];
            }
            return a[n-1];
        }
    }
    public static void main (String[] args)
    {
        System.out.println("Moi ban nhap n:");
        int n = Nhap();
        System.out.println("So fibonaci thu "+n+" la:"+Fibonaci(n)); 
    }
}
