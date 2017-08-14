import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    ArrayList<Posts> postsList = new ArrayList<>();
    
    public NewsFeed(){
        start();
    }
    public void addPost(Posts post){
        postsList.add(post);
    }
    public void start(){
        String un = "anon";
        String c = "content";
        
        for (int i = 0; i < 3; i++){
            MessagePosts mp = new MessagePosts(un, c);
            addPost(mp);
        }
    }
    public String toString(){
        String retStr = "";
        for (Posts post: postsList){
            retStr += "\n" + post.toString() + "\n";
        }
        
        return retStr;
    }
    
    public void printNewsFeed(){
        System.out.println(this.toString());
    }
    
    /*public JPanel messagePostPanel(String content){
        JPanel retPanel = new JPanel();
        JLabel cLabel = new JLabel(content);
        retPanel.add(cLabel);
       
        return retPanel;
    }*/
    
    public static void main(String[]args){
        NewsFeed newsFeed = new NewsFeed();
        newsFeed.printNewsFeed();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
