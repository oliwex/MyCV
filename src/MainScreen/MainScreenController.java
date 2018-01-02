/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreen;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Thread.sleep;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.util.Duration;


/**
 * FXML Controller class
 *
 * @author oliwe
 */
public class MainScreenController implements Initializable {
    
    @FXML
    private ImageView imageView;
    @FXML
    private SplitPane mainSplitPane;
    @FXML
    private SplitPane leftSplitPane;
    @FXML
    private SplitPane rightSplitPane;
    @FXML
    private GridPane gridPane;
    @FXML
    private Text text;

    @FXML
    private void setImage()
    {
        this.imageView.setImage(new Image(new File("src/Image/profile.png").toURI().toString()));
    }
    @FXML
    private void setSplitPane()
    {
        //TODO: ustawić na niezmieniające się podzielniki
        this.mainSplitPane.setDividerPositions(0.35);
        this.leftSplitPane.setDividerPositions(0.4);
        this.rightSplitPane.setDividerPositions(0.6);   
    }
    
    @FXML
    private void setGridPane()
    {
        this.gridPane.add(new Label("HTML"),0,0);
        this.gridPane.add(new Label("CSS"),0,1);
        this.gridPane.add(new Label("PHP"),0,2);
        this.gridPane.add(new Label("WORDPRESS"),0,3);
        this.gridPane.add(new Label("JAVA"),0,4);
        this.gridPane.add(new Label("JAVA-FX"),0,5);
        
        this.gridPane.add(new ProgressBar(0.55),1,0);
        this.gridPane.add(new ProgressBar(0.45),1,1);
        this.gridPane.add(new ProgressBar(0.30),1,2);
        this.gridPane.add(new ProgressBar(0.6),1,3);
        this.gridPane.add(new ProgressBar(0.7),1,4);
        this.gridPane.add(new ProgressBar(0.4),1,5);
    }
    @FXML
    private void setText() 
    {
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        this.setImage();
        this.setSplitPane();
        this.setGridPane();
        
        /*czytacz textu z pliku*/
        final String content = "abcdefghijklmnoprstuwxyzabcdefghijklmnoprstuwxyzabcdefghijklmnoprstuwxyz";
        
       
        final Animation animation = new Transition() 
        {
            {
                setCycleDuration(Duration.millis(7000));
            }

            @Override
            protected void interpolate(double frac) {
                final int length = content.length();
                final int n = Math.round(length * (float) frac);
                text.setText(content.substring(0, n));
            }

        };  
        animation.play();

        
        
    }    
    
}
