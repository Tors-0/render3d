import java.util.ArrayList;

public class Shape {
    protected ArrayList<Vertex> v = new ArrayList<>();
    protected ArrayList<Edge> e = new ArrayList<>();
    protected static ArrayList<Shape> shapes = new ArrayList<>();
    public ArrayList<Edge> getEdges() {
        return e;
    }
    public ArrayList<Vertex> getVertices() {
        return v;
    }
    public static ArrayList<Shape> getCubes() {
        return shapes;
    }
}
