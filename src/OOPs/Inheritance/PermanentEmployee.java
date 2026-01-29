package CORE_JAVA.Inheritance;

public class PermanentEmployee extends TemporaryEmployee {
    private String department;
    private String designation;

    public void acceptData() {
        department = "Cricket";
        designation = "Batter";
    }
    public void showData() {
        System.out.println("Employee Number is : " +employeeNumber);
        System.out.println("Employee Name is : " +employeeName);
        System.out.println("Employee Address is : " +getEmployeeAddress);
        System.out.println("Employee Department is : " +department);
        System.out.println("Employee Designation is : " +designation);
    }
}
