import java.util.ArrayList;
import java.util.HashMap;

public class Cube {
    private ArrayList<Vertex> v; // list of all 8 contained vertices
    private Vertex[][] e = new Vertex[2][12]; // list of all 12 edge relations
    public Cube(int x, int y, int z, int len) {
        len--; // offset len to account for OBO error

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
        e[0][0] = v.get(4); e[1][0] = v.get(6);
        e[0][1] = v.get(4); e[1][1] = v.get(0);
        e[0][2] = v.get(4); e[1][2] = v.get(5);
        e[0][3] = v.get(1); e[1][3] = v.get(0);
        e[0][4] = v.get(1); e[1][4] = v.get(3);
        e[0][5] = v.get(1); e[1][5] = v.get(5);
        e[0][6] = v.get(2); e[1][6] = v.get(0);
        e[0][7] = v.get(2); e[1][7] = v.get(3);
        e[0][8] = v.get(2); e[1][8] = v.get(6);
        e[0][9] = v.get(7); e[1][9] = v.get(5);
        e[0][10] = v.get(7); e[1][10] = v.get(3);
        e[0][11] = v.get(7); e[1][11] = v.get(6);
    }
}
