import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainForm7Controller {
    public TableView<CustomerTM> tblCustomer;
    public TableColumn colNic;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TableColumn colDelete;

    public void initialize() {
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));

        loadData();
    }

    private void loadData() {
        ObservableList<CustomerTM> obList = FXCollections.observableArrayList();
        for (Customer c : Database.customerDataList) {
            Button btn = new Button("Delete");
            obList.add(new CustomerTM(c.getNic(), c.getName(), c.getAddress(), c.getSalary(), btn));

            btn.setOnAction((e) -> {
                Database.customerDataList.remove(c);
            });

        }
        tblCustomer.setItems(obList);
    }
}