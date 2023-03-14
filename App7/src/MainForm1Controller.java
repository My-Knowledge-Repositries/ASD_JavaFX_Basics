import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.Arrays;

public class MainForm1Controller {
    public ComboBox<String> cmbLanguage;
    ArrayList<String> myLangList = new ArrayList<>(
            Arrays.asList("Java","Php","C#","Kotlin")
    );

    public void initialize() {
        System.out.println(myLangList);
        // listener
        cmbLanguage.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("new value : " + newValue);
            System.out.println("old value : " + oldValue);
        });

        loadData();
    }

    private void loadData() {
        /*First Method*/
        /*
        cmbLanguage.getItems().add("Java");
        cmbLanguage.getItems().add("Php");
        cmbLanguage.getItems().add("C#");
        cmbLanguage.getItems().add("Ruby");
        */

        /*Second Method*/
        /*cmbLanguage.getItems().addAll("Java", "Php", "C#", "Ruby");*/

        /*Third Method - using observable list*/
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Java", "Php", "C#", "Ruby");
        cmbLanguage.setItems(list);
    }
}