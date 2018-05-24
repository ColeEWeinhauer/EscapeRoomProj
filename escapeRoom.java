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
        // set up JFrame
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1000,1620);
        String fileString[] = new String[35];
        fillFileString(fileString);
        displayImage(fileString[0], frame);
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

    public static void fillFileString(String string[]){
        for (int i=0; i<string.length; i++){
            string[i]="C:\\Users\\Cole\\Desktop\\Card JPG\\card" + i + ".jpg";
        }
    }


}
