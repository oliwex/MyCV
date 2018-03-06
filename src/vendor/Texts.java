/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendor;

import controller.MainScreenController;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.text.Text;
import javafx.util.Duration;



/**
 *
 * @author oliwe
 */
public class Texts {

    private final String filePath;
    
    public Texts(String filePath)
    {
        this.filePath=filePath;
    }

    public String readFromFile()
    {
        String fileContent = null;
        
        try 
        {
            fileContent = new String ( Files.readAllBytes( Paths.get(this.filePath) ) ); 
        } 
        catch (FileNotFoundException e) 
        {
            Logger.getLogger(MainScreenController.class.getName()).log(Level.SEVERE, null, e);
        }
        catch (IOException ex)
        {
            Logger.getLogger(MainScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fileContent;
    }
    
    public void typingTextAnimation(String textToAnimate, Text fieldToShow)
    {
      final Animation animation = new Transition() 
        {
            {
                setCycleDuration(Duration.seconds(20));
            }

            @Override
            protected void interpolate(double frac) {
                final int length = textToAnimate.length();
                final int n = Math.round(length * (float) frac);
                fieldToShow.setText(textToAnimate.substring(0, n));
            }

        };  
        animation.play();  
    }
     
        

    
    }
