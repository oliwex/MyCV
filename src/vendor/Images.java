/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendor;

import java.io.File;
import javafx.scene.image.Image;

/**
 *
 * @author oliwe
 */
public class Images {
    
    private final String imagePath;
    
    
    public Images(String imagePath)
    {
        this.imagePath=imagePath;
    }
    

    public Image setImage()
    {
        return new Image(new File(this.imagePath).toURI().toString(),300,300,true,true);
    }
}



