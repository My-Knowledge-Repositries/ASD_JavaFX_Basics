import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainForm2Controller {
    public TextField txtInputLanguage;
    public ListView<String> lstLanguages;
    public TextField txtSelectedLanguage;

    public void initialize(){
        lstLanguages.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            txtSelectedLanguage.setText(newValue);
        });
    }

    public void addDataOnAction(ActionEvent actionEvent) {
        String value = txtInputLanguage.getText();
        if (isExists(value)) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Alerady exists");
            alert.show();
            return;
        }
        lstLanguages.getItems().add(txtInputLanguage.getText());
        //txtInputLanguages.setText("");
        txtInputLanguage.clear(); // new java fx code
    }

    private boolean isExists(String value) {
        for (String tempData : lstLanguages.getItems()) {
            if (tempData.equalsIgnoreCase(value)) return true;
        }
        return false;
    }
}
