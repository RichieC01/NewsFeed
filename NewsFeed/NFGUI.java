import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class NFGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NFGUI
{
    NewsFeed newsfeed;
    private static final int HEIGHT = 450;
    private static final int WIDTH = 600;
    private static final int WESTWIDTH = 180;
    
    public NFGUI(){
        newsfeed = new NewsFeed();
    }
    
    public void postGUI(JPanel panel, Posts post){
        JPanel postPanel = new JPanel();
            postPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel username = new JLabel(post.getUsername());
            postPanel.add(username);
        JLabel date = new JLabel(post.getDate());
            postPanel.add(date);
            
        panel.add(postPanel);
    }
    /*public static void addPosts(){
        for (Posts post: newsfeed.getPosts()){
            postGUI(panel, post);
        }
    }*/
    
    public static void main (String[]args){
        boolean westPanelVis = false;
        //NewsFeed newsFeed = new NewsFeed();
        //newsFeed.printNewsFeed();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        
        JPanel westPanel = new JPanel();
            JTextArea text = new JTextArea();
                text.setPreferredSize(new Dimension(WESTWIDTH, HEIGHT-100));
            westPanel.add(text);
            JButton submit = new JButton("Submit");
            westPanel.add(submit);
        westPanel.setPreferredSize(new Dimension(WESTWIDTH, HEIGHT));
        panel.add(westPanel, BorderLayout.WEST);
        westPanel.setVisible(westPanelVis);
        
        JMenuBar mbar = new JMenuBar();
            JMenu filem = new JMenu("File");
                JMenuItem quit = new JMenuItem("Quit");
                quit.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                });
                filem.add(quit);
            mbar.add(filem);
            JMenu option = new JMenu("Option");
                JMenuItem addPost = new JMenuItem("Add Post");
                addPost.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        westPanelVis = !westPanelVis;
                        addPost.setText("Hide Text Area");
                    }
                });
                option.add(addPost);
            mbar.add(option);
        frame.setJMenuBar(mbar);
        
        JPanel feedPanel = new JPanel();
            feedPanel.setPreferredSize(new Dimension(WIDTH-WESTWIDTH, HEIGHT));
            feedPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(feedPanel, BorderLayout.CENTER);
        
        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        frame.pack();
        frame.setVisible(true);
    }
}
