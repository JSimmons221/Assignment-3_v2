public class Customer {
    private int customerID;
    private String customerName;
    private Employee employee;

    public Customer(int customerID, String customerName, Employee employee){
        this.customerID=customerID;
        this.customerName=customerName;
        this.employee=employee;
        employee.addCustomer(this);
    }

    public String toString(){
        return "Customer: " + customerName + ", Employee: " + employee.getEmployeeName();

    }

    public int getCustomerID(){return customerID;}
    public String getCustomerName(){return customerName;}
    public Employee getEmployee(){return employee;}

    public void setCustomerID(int id){customerID = id;}
    public void setCustomerName(String name){customerName = name;}
    public void setEmployee(Employee e){employee = e;}
}
