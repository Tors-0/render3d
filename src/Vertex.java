public class Vertex {
    // actual vertex coordinates
    private float x, y, z;
    public Vertex(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point project(float f) {
        float a = ((f * x)/(f + z));
        float b = ((f * y)/(f + z));
        return new Point(a,b);
    }
    public void rotateY(int theta) {
        float c = (float) Math.cos(Math.toRadians(theta));
        float s = (float) Math.cos(Math.toRadians(theta));
        x = c * x - s * z;
        z = s * x + c * z;
    }
    public String toString() {
        return "" + x + ", " + y + ", " + z;
    }
}
