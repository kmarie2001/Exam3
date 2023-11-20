public abstract class Employee extends Person {

    String department;
    double monthlySalary;
    String dateHired;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                " Department: " + department + '\n' +
                " Monthly salary: " + monthlySalary + '\n' +
                " Date hired: " + dateHired;
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired){
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }
}
