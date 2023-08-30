public class Pyramid extends Shape {
    public Pyramid(int rad) {
        v.add(new Vertex(-rad,-rad,-rad)); // 0
        v.add(new Vertex(-rad,-rad, rad)); // 1
        v.add(new Vertex( rad,-rad,-rad)); // 2
        v.add(new Vertex( rad,-rad, rad)); // 3
        v.add(new Vertex(0, rad, 0)); // 4

        e.add(new Edge(v.get(0),v.get(1)));
        e.add(new Edge(v.get(0),v.get(2)));
        e.add(new Edge(v.get(0),v.get(4)));
        e.add(new Edge(v.get(3),v.get(2)));
        e.add(new Edge(v.get(3),v.get(1)));
        e.add(new Edge(v.get(3),v.get(4)));
        e.add(new Edge(v.get(4),v.get(1)));
        e.add(new Edge(v.get(4),v.get(2)));

        shapes.add(this);
    }
}
