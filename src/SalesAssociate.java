public class SalesAssociate extends Employee{
    protected double salary=35000;
    protected SalesManager manager;

    public SalesAssociate(int employeeID, String employeeName, SalesManager manager) {
        super(employeeID, employeeName);
        this.manager=manager;
    }

    public double totalSales(){
        return customers.size()*100;
    }


    @Override
    public void setManager(SalesManager salesManager) {
        manager=salesManager;
    }

    public SalesManager getManager(){return manager;}

    @Override
    public String toString() {
        return "Sales Associate " + getEmployeeName()
                + ". Manager: " + manager.getEmployeeName()
                + ". Employees: null. Total Sales: " + totalSales();
    }
}
