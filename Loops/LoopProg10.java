//Palindrome Number.
package Loops;
import java.util.*;
public class LoopProg10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        int num1 = num;
        int r,rev = 0;
        while(num>0)
        {
            r = num%10;
            num = num/10;
            rev = (rev*10)+r;
        }
        System.out.println("The reversed number is = "+rev);
        if(rev == num1)
        {
            System.out.println("The number is Palindrome");
        }
        else
        {
            System.out.println("The number is not Palindrome");
        }
    }
}