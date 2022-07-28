

import processing.core.PApplet;
public class FourBallsChallenge extends PApplet{
    int x=0,y=0,z=0,a=0;
    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(668,448);
    }

    @Override
    public void draw() {

        ellipse(x, 448 / 5, 10, 10);
        ellipse(y, (2 * 448) / 5, 10, 10);
        ellipse(z, (3 * 448) / 5, 10, 10);
        ellipse(a, (4 * 448) / 5, 10, 10);
        x=x+1;
        y=y+2;
        z=z+3;
        a=a+4;

    }
}
