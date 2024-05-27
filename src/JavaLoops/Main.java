package JavaLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosunu istediğiniz değeri giriniz.");
        int num = input.nextInt();


        if (num>=2&&num<=20){
            for (int i=1;i<=10;i++){
                int result=num*i;
                System.out.println(num+"x"+i+"="+result);
            }
        }else {
            System.out.println("2 ile 20 arasında bir değer giriniz.");
        }

    }
}
