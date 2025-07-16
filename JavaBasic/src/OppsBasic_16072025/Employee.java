package OppsBasic_16072025;

public class Employee extends Test {

    private int employeeId;
    private String employeeName;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDepartment=" + employeeDepartment +
                '}';
    }

    private Integer employeeSalary;
    private Department employeeDepartment;

    @Override
    public void setData() {
        employeeId = (int) (Math.random() * 100);
        employeeName ="chaitanya";
        employeeSalary = (int)(Math.random() * 100);
        Department department = new Department();
        employeeDepartment = department.getDepartment();
    }

    public Employee getEmployee() {
        setData();
        return this;
    }
}
