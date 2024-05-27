package JavaDatatypes;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Number of data to enter: ");
        int t= input.nextInt();//How much value will be received from the user.

        for (int i=0;i<t;i++){//The loop runs as long as the value received.
            try {//It is checked whether the value received from the user is within the range.
                System.out.println("Enter the "+(i+1)+". number");
                long x=input.nextLong();
                System.out.println(x+" can be fitted id");
                if (x>=Byte.MIN_VALUE&&x<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }if (x>=Short.MIN_VALUE&&x<=Short.MAX_VALUE){
                    System.out.println("* short");
                }if (x>=Integer.MIN_VALUE&&x<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }if (x>=Long.MIN_VALUE&&x<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch (Exception e){
                System.out.println(input.next()+ " cant be fitted anywhere ");
            }
        }
    }
}
