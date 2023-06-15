package pedro.ieslaencanta.com.eventostemplate;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private GridPane grid;

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
         this.createGridView();
        var scene = new Scene(this.grid, 640, 480);
       
         stage.setScene(scene);
        stage.show();
    }
  public void createGridView() {
        this.grid = new GridPane();
        this.grid.setMinSize(640, 480);
        this.grid.setAlignment(Pos.CENTER);
        var ligth = new LightComponent();
        var sswitch= new SwitchComponent(); 
       
         
        this.grid.add(ligth, 0, 0);
        this.grid.add( sswitch, 1, 0);
      
    }
    public static void main(String[] args) {
        launch();
    }

}
