package OppsBasic_16072025HW;

public class Department extends Office {
    private int departmentId;
    private String departmentName;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", employeeOfficeDetails=" + employeeOfficeDetails +
                '}';
    }

    private EmployeeDetails employeeOfficeDetails;

    @Override
    public void setData() {
        departmentId = 6061;
        departmentName = "Communication Navigation";
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeOfficeDetails = employeeDetails.getEmployeeDetails();
    }

    public Department getDepartmentDetails() {
        setData();
        return this;
    }
}
