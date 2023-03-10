import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class LogInFormController {

    public TextField txtName;

    public void printMyNameOnAction(ActionEvent actionEvent) {
        System.out.println(txtName.getText());
    }
}
