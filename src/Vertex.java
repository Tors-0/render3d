public class Vertex {
    // actual vertex coordinates
    private double x, y, z;
    public Vertex(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point project(double f) {
        double a = ((f * x)/(f + z));
        double b = ((f * y)/(f + z));
        return new Point(a,b);
    }
    public void rotateY(double theta) {
        double c = Math.cos(Math.toRadians(theta));
        double s = Math.sin(Math.toRadians(theta));
        x = c * x - s * z;
        z = s * x + c * z;
    }
    public double distanceTo(Vertex other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2) + Math.pow(this.z - other.z, 2));
    }
    @Override
    public String toString() {
        return "" + x + ", " + y + ", " + z;
    }
}
