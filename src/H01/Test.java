package H01;

/**
 * Created by Brandon on 4-10-2016.
 */
//Voorbeeld 2.2

import java.awt.*;
import java.applet.*;

public class Test extends Applet {

    public void init() {
        setBackground(Color.magenta);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}