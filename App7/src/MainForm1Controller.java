import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class MainForm1Controller {
    public ComboBox<String> cmbLanguage;

    public void initialize() {
        // listener
        cmbLanguage.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("new value : " +newValue);
            System.out.println("old value : " +oldValue);
        });

        loadData();
    }

    private void loadData() {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Java", "Php", "C#", "Ruby");
        cmbLanguage.setItems(list);
    }
}