import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;
import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
        randPosts();
    }
    
    public void addPost(Posts post){
        postsList.add(post);
    }
    public ArrayList getPosts(){
        return postsList;
    }
    
    public void randPosts(){
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
}
