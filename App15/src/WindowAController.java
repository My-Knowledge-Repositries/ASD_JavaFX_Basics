import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class WindowAController {
    public AnchorPane contextA;

    public void nextOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("WindowB.fxml"));
        Stage stage = (Stage) contextA.getScene().getWindow();
        stage.setScene(new Scene(load));
    }
}
