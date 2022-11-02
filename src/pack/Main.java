package pack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            method(sc.nextInt());
        } catch (Exception e) {
           e.printStackTrace();
        }finally {
            System.out.println("no");
        }
    }

    static void method(int a) throws Exception {
        if (a<1) {
            throw new Exception("nope");
        }else{
            int f=1;
        for (int i = 1; i <=a; i++) {
            f = f * i;
            System.out.println(f);
        }

        }
    }
}
