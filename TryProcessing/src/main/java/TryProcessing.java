import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 680;
    public static final int HEIGHT = 680;
    public static final int DIAMETER = 10;
    int w=0;
    int x =0;
    int y=0;
    int z=0;

    @Override
    public void setup() {

    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void draw() {
        getEllipse1();
        getEllipse2();
        getEllipse3();
        getEllipse4();
    }

    private void getEllipse1() {
        ellipse(w, HEIGHT/5, DIAMETER, DIAMETER);
        w++;
    }

    private void getEllipse2() {
        ellipse(x, (HEIGHT*2)/5, DIAMETER, DIAMETER);
        x+=2;
    }

    private void getEllipse3() {
        ellipse(y, (HEIGHT*3)/5, DIAMETER, DIAMETER);
        y+=3;
    }

    private void getEllipse4() {
        ellipse(z, (HEIGHT*4)/5, DIAMETER, DIAMETER);
        z+=4;
    }

    public static void main(String args[]) {
        PApplet.main("TryProcessing", args);


    }
}
