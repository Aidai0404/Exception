package homeworkvar;

public class Car implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Машина закрывается");

    }
    void drive(){
        System.out.println("Машина едет");
    }

}
