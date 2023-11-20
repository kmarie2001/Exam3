public class Student extends Person {

    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + '\n' + super.toString() + '\n' +
                " Status: " + status;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String status){
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }
}
