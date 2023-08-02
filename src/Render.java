import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Render {
    static double fps = 120; // FPS
    static double focal = 256; // FOCAL DISTANCE
    static double rotAng = 0.1; // DEGREES TO ROTATE PER FRAME
    static DrawingPanel panel = new DrawingPanel(500,500);
    static Graphics g = panel.getGraphics();
    public static void start() {
        ScheduledExecutorService timedEvent = Executors.newScheduledThreadPool(1);
        timedEvent.scheduleAtFixedRate(Render::update,0,(long)(1000/fps), TimeUnit.MILLISECONDS);
        timedEvent.scheduleAtFixedRate(Render::rotateY,0,(long)(1000/fps), TimeUnit.MILLISECONDS);
    }
    public static void update() {
        panel.clearWithoutRepaint();
        Cube.getCubes().forEach(c ->{
            c.getEdges().forEach(e ->{
                Vertex a = e.getA();
                Vertex b = e.getB();
                Point x = a.project(focal);
                Point y = b.project(focal);
                g.drawLine((int) (Math.round(x.getX())+250), (int) (Math.round(x.getY())+250), (int) (Math.round(y.getX())+250), (int) (Math.round(y.getY())+250));
            });
        });
        //verify();
    }
    public static void rotateY() {
        Cube.getCubes().forEach(c->{
            c.getVertices().forEach(v->{
                v.rotateY(rotAng);
            });
        });
    }
    public static void verify() {
        Edge a = Cube.getCubes().get(0).getEdges().get(0);
        System.out.println(a.getA().distanceTo(a.getB()));
    }
}