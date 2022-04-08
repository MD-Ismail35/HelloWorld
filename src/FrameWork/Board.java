package FrameWork;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    Image ClassImage;

    Board()
    {
        ImageIcon i = new ImageIcon("car.gif");
        ClassImage = i.getImage();
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(ClassImage,100,0,this);
    }
    //C211035
    //Ismail
}
