package Interface;
public class Interface {

    public static void main(String[] args) {
	    CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
	    customerManager.add();
    }
}
