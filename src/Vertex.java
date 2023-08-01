public class Vertex {
    // actual vertex coordinates
    private static int x, y, z;
    public Vertex(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int projectX(float f) {
        return (int) ((f * x)/(f + z));
    }
    public int projectY(float f) {
        return (int) ((f * y)/(f + z));
    }
}
