import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Render {
    static int fps = 60; // FPS
    static float focal = 256; // FOCAL DISTANCE
    static int rotAng = 3; // DEGREES TO ROTATE PER FRAME
    static DrawingPanel panel = new DrawingPanel(500,500);
    static Graphics g = panel.getGraphics();
    public static void start() {
        ScheduledExecutorService timedEvent = Executors.newScheduledThreadPool(1);
        Scanner in = new Scanner(System.in);
        System.out.print("Press [ENTER] to begin...");
        String a = in.nextLine();
        timedEvent.scheduleAtFixedRate(Render::update,0,(1000/fps), TimeUnit.MILLISECONDS);
    }
    public static void update() {
        panel.clearWithoutRepaint();
        Cube.getCubes().forEach(c ->{
            c.getEdges().forEach(e ->{
                Vertex a = e.getA();
                Vertex b = e.getB();
                Point x = a.project(focal);
                Point y = b.project(focal);
                g.drawLine(250+x.getX(),250+x.getY(),250+y.getX(),250+y.getY());
            });
        });
        Cube.getCubes().forEach(c->{
            c.getVertices().forEach(v->{
                v.rotateY(rotAng);
            });
        });
    }
}