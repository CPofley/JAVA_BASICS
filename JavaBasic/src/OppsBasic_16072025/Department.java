package OppsBasic_16072025;

public class Department extends Test{

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    private int departmentId;
    private String departmentName;

    @Override
    public void setData() {
        departmentId = 1;
        departmentName = "CNS";
    }
    public Department getDepartment() {
        setData();
        return this;

    }
}
