import java.util.Date;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Posts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Posts
{
    //DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
   
    Date date;
    String username;
    
    public Posts(String username){
        this.date = new Date();
        this.username = username;
    }
    public String getDate(){
        return df.format(date);
    }
    public String getUsername(){
        return username;
    }
    public String toString(){
        String retStr = "";
        retStr += getDate() + "\n" + getUsername();
        
        return retStr;
    }
    
    
    public void printStr(){
        System.out.println(getDate());
        System.out.println(getUsername());
    }
}
