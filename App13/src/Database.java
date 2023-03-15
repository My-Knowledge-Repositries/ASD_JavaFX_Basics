import java.util.ArrayList;

public class Database {
    public static ArrayList<Customer> customerDataList = new ArrayList<>();

    static {
        customerDataList.add(new Customer("334", "nimal", "colombo", 25000));
        customerDataList.add(new Customer("345", "banda", "jaffna", 50000));
        customerDataList.add(new Customer("454", "jagath", "galle", 45000));
        customerDataList.add(new Customer("465", "saman", "panadura", 95000));
    }
}
