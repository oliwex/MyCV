/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import vendor.Images;
import vendor.Texts;

/**
 * FXML Controller class
 *
 * @author oliwe
 */
public class MainScreenController implements Initializable {

    private final int WRAPPING_SIZE=500;
    
    @FXML
    private SplitPane mainSplitPane;
    
    @FXML
    private SplitPane leftSplitPane;
    @FXML
    private ImageView mainImageView;
    @FXML
    private GridPane mainGridPane;
    
    @FXML
    private SplitPane rightSplitPane;
    @FXML
    private Text mainText;
    @FXML
    private Text mainTitle;
    
    
    @FXML
    private Accordion mainAccordion;
    
    @FXML
    private TitledPane mainTitledPane;
    @FXML
    private Text mainBottomText;
    
    @FXML
    private void setSplitPane()
    {
        //TODO: ustawić na niezmieniające się podzielniki
        this.mainSplitPane.setDividerPositions(0.35);
        this.leftSplitPane.setDividerPositions(0.4);
        this.rightSplitPane.setDividerPositions(0.6);   
    }
    
    @FXML
    private void setImage()
    {
        this.mainImageView.setImage(new Images("src/object/image/profile.png").setImage());
    }
    
    @FXML
    private void setGridPane()
    {
        this.mainGridPane.add(new Label("HTML"),0,0);
        this.mainGridPane.add(new Label("CSS"),0,1);
        this.mainGridPane.add(new Label("PHP"),0,2);
        this.mainGridPane.add(new Label("WORDPRESS"),0,3);
        this.mainGridPane.add(new Label("JAVA"),0,4);
        this.mainGridPane.add(new Label("JAVA-FX"),0,5);
        
        this.mainGridPane.add(new ProgressBar(0.55),1,0);
        this.mainGridPane.add(new ProgressBar(0.45),1,1);
        this.mainGridPane.add(new ProgressBar(0.30),1,2);
        this.mainGridPane.add(new ProgressBar(0.6),1,3);
        this.mainGridPane.add(new ProgressBar(0.7),1,4);
        this.mainGridPane.add(new ProgressBar(0.4),1,5);
    }
    
    /*-----------------------------------------------------------------------*/
    private void setTextParameters(Text textField)
    {
        textField.setWrappingWidth(WRAPPING_SIZE);
        textField.setFont(Font.font ("Monotype Corsiva", 20));
        textField.setTextAlignment(TextAlignment.CENTER);  
    }
    
    @FXML
    private void setMainText()
    {
        this.mainText.setWrappingWidth(WRAPPING_SIZE);
        this.mainText.setFont(new Font(17));
        
        Texts content = new Texts("src/object/file/about.txt");
        
        String textToAnimate=content.readFromFile();
        
        content.typingTextAnimation(textToAnimate,this.mainText);
       
        
    }
    
    @FXML
    private void setMainTitle()
    {
        this.setTextParameters(this.mainTitle);
        this.mainTitle.setText("Historia zatrudnienia");
 
    }
    
    
    @FXML
    private void setMainAccordion()
    {
        
    }
    
    @FXML
    private void setMainTitledPane()
    {
        this.mainTitledPane.setAnimated(false);
        this.mainTitledPane.setText("Nawigacja");
    }
    
    @FXML
    private void setMainBottomText()
    {
        this.setTextParameters(this.mainBottomText);
        this.mainBottomText.setText("Jeśli chcesz przeczytać więcej wybierz odpowiedni przycisk");

    }
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.setSplitPane();
        this.setGridPane();
        this.setImage();
        this.setMainText();
        this.setMainTitle();
        
        this.setMainTitledPane();
        this.setMainBottomText();
    }    
    
}
