import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class MainForm1Controller {
    public ComboBox<String> cmbLanguage;

    public void initialize() {
        loadData();
    }

    private void loadData() {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Java", "Php", "C#", "Ruby");
        cmbLanguage.setItems(list);
    }
}