import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class escapeRoom {

    public static void main(String avg[]) throws IOException
    {
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        String imageString = "C:\\Users\\Cole\\Desktop\\download.jpg";
        displayImage(imageString, frame);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void displayImage(String string, JFrame frame) throws IOException
    {
        BufferedImage image=ImageIO.read(new File(string));
        ImageIcon icon=new ImageIcon(image);
        JLabel label=new JLabel();
        label.setIcon(icon);
        frame.add(label);
    }
}
