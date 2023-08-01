import java.util.ArrayList;
import java.util.HashMap;

public class Cube {
    private ArrayList<Vertex> v = new ArrayList<>(); // list of all 8 contained vertices
    //private Vertex[][] e = new Vertex[2][12]; // list of all 12 edge relations
    private ArrayList<Edge> e = new ArrayList<>();
    private static ArrayList<Cube> cubes = new ArrayList<>();
    public Cube(int x, int y, int z, int len) {
        // initialize vertices to proper points
        v.add(0,new Vertex(x,y,z)); // vertex C
        v.add(1,new Vertex(x+len,y,z)); // vertex D
        v.add(2,new Vertex(x,y,z+len)); // vertex G
        v.add(3,new Vertex(x+len,y,z+len)); // vertex H
        v.add(4,new Vertex(x,y+len,z)); // vertex A
        v.add(5,new Vertex(x+len,y+len,z)); // vertex B
        v.add(6,new Vertex(x,y+len,z+len)); // vertex E
        v.add(7,new Vertex(x+len,y+len,z+len)); // vertex F

        // initialize edge table
        e.add(0,new Edge(v.get(4),v.get(6))); // edge AE
        e.add(1,new Edge(v.get(4),v.get(0))); // edge AC
        e.add(2,new Edge(v.get(4),v.get(5))); // edge AB
        e.add(3,new Edge(v.get(1),v.get(0))); // edge DC
        e.add(4,new Edge(v.get(1),v.get(3))); // edge DH
        e.add(5,new Edge(v.get(1),v.get(5))); // edge DB
        e.add(6,new Edge(v.get(2),v.get(0))); // edge GC
        e.add(7,new Edge(v.get(2),v.get(3))); // edge GH
        e.add(8,new Edge(v.get(2),v.get(6))); // edge GE
        e.add(9,new Edge(v.get(7),v.get(5))); // edge FB
        e.add(10,new Edge(v.get(7),v.get(3))); // edge FH
        e.add(11,new Edge(v.get(7),v.get(6))); // edge FE

        // add each cube object to arraylist for render
        cubes.add(this);
    }
    public ArrayList<Edge> getEdges() {
        return e;
    }
    public ArrayList<Vertex> getVertices() {
        return v;
    }
    public static ArrayList<Cube> getCubes() {
        return cubes;
    }
    public static void init() {}
}
