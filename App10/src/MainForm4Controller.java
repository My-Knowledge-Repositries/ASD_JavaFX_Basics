import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;

public class MainForm4Controller {
    public CheckBox cbxJava;
    public CheckBox cbxPhp;
    public CheckBox cbxKotlin;

    public void showDataOnAction(ActionEvent actionEvent) {
        ArrayList<String> langList = new ArrayList<>();
        if (cbxJava.isSelected()) langList.add("Java");
        if (cbxPhp.isSelected()) langList.add("Php");
        if (cbxKotlin.isSelected()) langList.add("Kotlin");
        System.out.println(langList);
    }
}
