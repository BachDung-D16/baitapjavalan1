
package baitapjava;
import java.util.Scanner;
public class Bai1 {
    public static int Nhap()
    {
        Scanner nhap = new Scanner (System.in);
        boolean check = false;
        int t ;
        do{
            t = nhap.nextInt();
        } while (t == 0 || t<0);
        return (t);
    }
    public static int UCLN(int a, int b)
    {
        while (a!=b)
        {
            if (a>b)
                a=a-b;
            else
                b = b-a;
        }
        return (a);
    }
    public static void main(String [] args)
    {
        System.out.println("Nhap a:");
        int a = Nhap();
        System.out.println("Nhap b:");
        int b = Nhap();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
        System.out.println("Boi chung nho nhat cua "+a+" va "+b+ " la " +((a*b)/UCLN(a,b)));
    }
    
}
