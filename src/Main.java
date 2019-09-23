import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;


    @Override
    public void start(Stage primaryStage) throws Exception{

        this.primaryStage= primaryStage;

        mainWindow();
    }

    private void mainWindow(){

        try{

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("UI.fxml"));
            AnchorPane pane = loader.load();
            Controller mainWindowController = loader.getController();
            Scene scene = new Scene(pane);

            mainWindowController.setMain();
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch(IOException e){

            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        launch(args);
    }
}
