public class Client {
    public static void main(String[] args) {
        new Cube(-64,-64,-64,128);
        new Pyramid(50);
        Render.start();
    }
}
