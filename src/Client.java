import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        new Cube(-64,-64,-64,128);
        new Pyramid(5);
        Render.start();
    }
}
