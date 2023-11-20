public class Faculty extends Employee {

    String officeHours;
    String rank;

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + '\n' + super.toString() + '\n' +
                " Office hours: " + officeHours + '\n' +
                " Rank: " + rank;
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired, String officeHours, String rank){
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
}
