import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;

public class MainForm3Controller {
    public RadioButton rBtnMale;
    public RadioButton rBtnFemale;

    public void printDataOnAction(ActionEvent actionEvent) {
        /*First Method*/
        //if (rBtnMale.isSelected()) System.out.println("Male");
        //if (rBtnFemale.isSelected()) System.out.println("Female");

        /*Second Method*/
        /*String gender = "Male";
        if (rBtnFemale.isSelected()) {
            gender = "FeMale";
        }*/

        /*Third Method*/
        System.out.println(rBtnFemale.isSelected() ? "Female" : "Male");
    }
}
