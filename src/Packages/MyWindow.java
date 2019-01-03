package Packages;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title)  {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sanSerifLarge = new Font("San Serif", Font.BOLD, 18);
        Font sanSerifSmall = new Font("San Serif", Font.BOLD, 12);
        g.setFont(sanSerifLarge);
        g.drawString("Very confused", 250, 70);
        g.setFont(sanSerifSmall);
        g.drawString("still not sure", 250, 35);
    }


}
