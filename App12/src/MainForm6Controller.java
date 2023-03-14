import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class MainForm6Controller {
    NumberAxis xAxis = new NumberAxis(1, 7, 1);

    NumberAxis yAxis = new NumberAxis(10, 500, 20);
    public AreaChart<Number, Number> chart = new AreaChart<>(xAxis, yAxis);

    public void initialize() {
        xAxis.setLabel("Day");
        yAxis.setLabel("Student Count");
        XYChart.Series javaStudent = new XYChart.Series();
        javaStudent.setName("Java");
        javaStudent.getData().add(new XYChart.Data<>(1, 20));
        javaStudent.getData().add(new XYChart.Data<>(2, 450));
        javaStudent.getData().add(new XYChart.Data<>(3, 250));
        javaStudent.getData().add(new XYChart.Data<>(4, 50));
        javaStudent.getData().add(new XYChart.Data<>(5, 350));
        javaStudent.getData().add(new XYChart.Data<>(6, 150));
        javaStudent.getData().add(new XYChart.Data<>(7, 100));

        XYChart.Series phpStudent = new XYChart.Series();
        phpStudent.setName("Php");
        phpStudent.getData().add(new XYChart.Data<>(1, 40));
        phpStudent.getData().add(new XYChart.Data<>(2, 450));
        phpStudent.getData().add(new XYChart.Data<>(3, 500));
        phpStudent.getData().add(new XYChart.Data<>(4, 50));
        phpStudent.getData().add(new XYChart.Data<>(5, 150));
        phpStudent.getData().add(new XYChart.Data<>(6, 400));
        phpStudent.getData().add(new XYChart.Data<>(7, 100));
        chart.getData().addAll(javaStudent, phpStudent);
    }
}
