
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double s=Math.sqrt(a);
        double c = s - Math.floor(s);
        if (c != 0) {
            try {
                throw new Error();
            } catch (ArithmeticException d) {
             d.getMessage();
            }


//        int a = sc.nextInt();
//
//        if (b != Math.sqrt(a)) {
//            try {
//                throw new Error();
//            } catch (ArithmeticException e) {
//                throw new RuntimeException(e);
//            }
//        }else {
//            System.out.println("good");
//        }
        }
    }
}