
package FrameWork;
import javax.swing.JFrame;
public class FrameExample {
    public static void main(String[] args)
    {
        Board b = new Board();

        JFrame f = new JFrame();
        f.setSize(100,100);
        f.add(b);
        f.setVisible(true);
    }
    //C211035
    //Ismail
}
