public class Staff extends Employee {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + '\n' + super.toString() + '\n' +
                " Title: " + title;
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired, String title){
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.title = title;
    }
}
