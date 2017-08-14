import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * Write a description of class ImagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImagePosts extends Posts
{
    BufferedImage img = null;

    /**
     * Constructor for objects of class ImagePost
     */
    public ImagePosts(String username, String imgName){
        super(username);
        
        try{
            img = ImageIO.read(new File(imgName));
        } catch (IOException e){
            System.out.println("file doesn't exist");
        }
    }
    
    public void showImage(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        panel.add(imgLabel);
        
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
