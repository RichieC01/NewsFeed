
/**
 * Write a description of class MessagePosts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePosts extends Posts
{
    String content;
    
    /**
     * Constructor for objects of class MessagePosts
     */
    public MessagePosts(String username, String content){
        super(username);
        this.content = content;
    }
    public String toString(){
        String retStr = super.toString() + "\n" + content;
        
        return retStr;
    }
    public void printStr(){
        super.printStr();
        System.out.println(content);
    }
}
