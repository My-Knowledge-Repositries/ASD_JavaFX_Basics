import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowBController {
    public AnchorPane contextB;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("WindowA.fxml"));
        Stage stage = (Stage) contextB.getScene().getWindow();
        stage.setScene(new Scene(load));
    }
}
