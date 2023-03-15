import javafx.scene.control.Button;

public class CustomerTM {
    private String nic;
    private String name;
    private String address;
    private double salary;
    private Button btn;

    public CustomerTM() {
    }

    public CustomerTM(String nic, String name, String address, double salary, Button btn) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.btn = btn;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "CustomerTM{" +
                "nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", btn=" + btn +
                '}';
    }
}