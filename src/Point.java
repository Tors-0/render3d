public class Point {
    private float x;
    private float y;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return Math.round(x);
    }
    public int getY() {
        return Math.round(y);
    }
}
