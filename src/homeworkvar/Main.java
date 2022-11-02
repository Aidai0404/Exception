package homeworkvar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car=new Car();
        try(car){
            car.drive();
        } catch (RuntimeException e) {
            e.getCause();
        }

    }

}

