import java.util.Hashtable;

public abstract class Employee {
    private int employeeID;
    private String employeeName;
    protected Hashtable<Customer, Integer> customers;

    public Employee(int employeeID, String employeeName){
        this.employeeID=employeeID;
        this.employeeName=employeeName;
        customers=new Hashtable<>();
    }

    public abstract void setManager(SalesManager salesManager);

    public void addCustomer(Customer customer){
        customers.put(customer, customer.getCustomerID());

    }

    public abstract String toString();

    public void setEmployeeID(int employeeID){this.employeeID=employeeID;}
    public int getEmployeeID(){return employeeID;}

    public void setEmployeeName(String employeeName){this.employeeName=employeeName;}
    public String getEmployeeName(){return employeeName;}

    public Hashtable<Customer, Integer> getCustomers(){return customers;}
}
