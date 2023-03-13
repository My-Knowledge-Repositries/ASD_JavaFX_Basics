import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MainFormController {
    public TextField txtLanguage;
    public TextField txtInputCountry;
    public TextField txtOutputCountry;
    public TextField txtVehicleInput;
    public TextField txtVehicleOutput;
    public TextField txtInput;

    public void clickMeOnAction(ActionEvent actionEvent) {
        System.out.println(txtLanguage.getText());
    }

    public void inputCountryOnKeyPressed(KeyEvent keyEvent) {
        String value = txtInputCountry.getText();
        txtOutputCountry.setText(value);
    }

    public void inputVehicleOnKeyReleased(KeyEvent keyEvent) {
        txtVehicleOutput.setText(txtVehicleInput.getText());
    }

    public void inputTextOnKeyReleased(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            System.out.println(txtInput.getText());
        }
    }
}
