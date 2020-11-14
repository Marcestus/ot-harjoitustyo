package tetris.ui;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TetrisUi extends Application{
    
    @Override
    public void init() throws Exception {
        // sovelluslogiikan alustus
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        // käyttöliittymä
        stage.setTitle("Tetris");
        stage.show();
    }
    
    @Override
    public void stop() throws Exception {
        //lopetustoimenpiteet
    }
    
    public static void main(String[] args) {
        launch(TetrisUi.class);
    }

    
}
