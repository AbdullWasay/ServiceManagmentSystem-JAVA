
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application
 {
    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("FirstPage.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("AIRPLANE MANAGEMENT SYSTEM");
            primaryStage.setScene(scene);
            primaryStage.show();
        } 
        catch (IOException e)
        {
            System.out.println("Error loading MainScene.fxml: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
    {
        Database1 D=new Database1();
        D.createStaffTableAndInsertDefaults();
        launch(args);
    }
}