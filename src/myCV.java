/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

/**
 *
 * @author oliwe
 */
public class MyCV extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       try {
            FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/view/MainScreen.fxml"));
            SplitPane splitpane=loader.load();
            
            Scene scene=new Scene(splitpane,900,800);
            scene.getStylesheets().add("/css/MainScreen.css");
            primaryStage.setScene(scene);
            primaryStage.setTitle("MyCV");
            
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(MyCV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
