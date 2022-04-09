import java.util.ArrayList;

public class SalesManager extends Employee{
    protected double salary;
    protected SalesManager manager;
    protected ArrayList<Employee> employees;

    public SalesManager(int employeeID, String employeeName, SalesManager manager) {
        super(employeeID, employeeName);
        this.manager=manager;
        employees=new ArrayList<>();
    }

    public void setSalary(Double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public void setManager(SalesManager manager) {
        this.manager=manager;
    }

    @Override
    public String toString() {
        String eString = "";
        if(employees.size()>0) {
            eString += employees.get(0).getEmployeeName() + " " + employees.get(0).getEmployeeID();

            for (int i = 1; i < employees.size(); i++) {
                eString += ", " + employees.get(i).getEmployeeName() + " " + employees.get(i).getEmployeeID();
            }
        }else{
            eString="null";
        }
        if (manager == null){
            return "Sales Manager: " + getEmployeeName()
                    + ". Manager: null"
                    + ". Employees: " + eString
                    + ". Total Sales: " + totalSales();
        }
        return "Sales Manager: " + getEmployeeName()
                + ". Manager: " + manager.getEmployeeName()
                + ". Employees: " + eString
                + ". Total Sales: " + totalSales();
    }

    public SalesManager getManager(){
        return manager;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    private ArrayList<Employee> getEmployees(){
        return employees;
    }

    public double totalSales(){
        int numSalesAssociates = 0;
        for(Employee employee: employees){
            if(employee.toString().substring(0,15).equals("Sales Associate")){
                numSalesAssociates++;
            }
        }
        return (this.customers.size() * 200)+ (numSalesAssociates*500);
    }

}
