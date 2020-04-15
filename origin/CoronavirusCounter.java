// Authors: Andrew Casperson & Thomas Lasbury

//Basic UI Libraries 
import java.awt.Color;
import javax.swing.JFrame;
import org.jsoup.Jsoup;

public class CoronavirusCounter
{
	
public static void main(String []args)
    { 
        CoronavirusCounter c = new CoronavirusCounter();
        CoronavirusCounter.createWindow();
    }
    
    // instance variables - replace the example below with your own
    
    private static void createWindow()
    {
         JFrame frame = new JFrame("Coronavirus Counter");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setBackground(Color.black);
         frame.setSize(1000,800);
         //This displays the wondow
         frame.setLocationRelativeTo(null);

         frame.setVisible(true);
    }

    /*
     * Constructor for objects of class test
     */
    
    public CoronavirusCounter()
    {
        // initialise instance variables

    }

    


}

