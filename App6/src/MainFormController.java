import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

//Interface types - marker interface, functional interface, simple interface
public class MainFormController {
    public PieChart chart;

    public void initialize() {
        loadChart();
    }

    private void loadChart() {
        ObservableList<PieChart.Data> chartData = FXCollections.observableArrayList();
        chartData.addAll(
                new PieChart.Data("Java", 25),
                new PieChart.Data("C#", 30),
                new PieChart.Data("Js", 5),
                new PieChart.Data("Ruby", 40)
        );
        chart.setData(chartData);
    }
}
