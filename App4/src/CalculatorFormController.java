import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

enum Exp {
    SUM, SUB, MUL, DIV
}

public class CalculatorFormController {
    public TextField txtNumberOne;
    public TextField txtNumberTwo;
    public TextField txtAnswer;

    public void sumOnAction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(execute(Exp.SUM)));
    }

    public void subOnAction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(execute(Exp.SUB)));
    }

    public void divOnAction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(execute(Exp.DIV)));
    }

    public void mulOnAction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(execute(Exp.MUL)));
    }

    private double execute(Exp exp) {
        double num1 = Double.parseDouble(txtNumberOne.getText());
        double num2 = Double.parseDouble(txtNumberTwo.getText());

        switch (exp) {
            case SUM:
                return num1 + num2;
            case SUB:
                return num1 - num2;
            case DIV:
                return num1 / num2;
            case MUL:
                return num1 * num2;
            default:
                return 0.0;
        }
    }
}
