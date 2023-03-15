import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Optional;

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

    // 2nd method
    /*ObservableList<CustomerTM> obList = FXCollections.observableArrayList();*/

    /*2nd method*/
    // obList.clear();

    private void loadData() {
        ObservableList<CustomerTM> obList = FXCollections.observableArrayList();
        for (Customer c : Database.customerDataList) {
            Button btn = new Button("Delete");
            obList.add(new CustomerTM(c.getNic(), c.getName(), c.getAddress(), c.getSalary(), btn));

            btn.setOnAction((e) -> {
                Alert conf = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure?", ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = conf.showAndWait(); //1.8 optional => null pointer exception
                if (buttonType.get() == ButtonType.YES) {
                    Database.customerDataList.remove(c);
                    loadData();
                }
            });
        }
        tblCustomer.setItems(obList);
    }
}