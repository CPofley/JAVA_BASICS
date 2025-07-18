package OppsBasic_16072025HW;

public class EmployeeDetails extends Office {
    private int employeeId;

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    private String employeeName;
    private int employeeSalary;

    @Override
    public void setData() {
        employeeId = 6061;
        employeeName = "Chaitanya";
        employeeSalary = (int)(Math.random() * 100);
    }

    public EmployeeDetails getEmployeeDetails() {
        setData();
        return this;
    }
}
