
import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycle extends Applet {

    public void init() {
        System.out.println("init()");
    }

    public void start() {
        System.out.println("start()");
    }

    public void stop() {
        System.out.println("stop()");
    }

    public void destroy() {
        System.out.println("destroy()");
    }

    public void paint(Graphics g) {
        g.drawString("Minimise and restore this window", 20, 30);
        System.out.println("paint()");
    }
}
