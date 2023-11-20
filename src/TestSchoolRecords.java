public class TestSchoolRecords {

    public static void main(String[] args) {
        Person[] credentials = new Person[]{

                new Student("Niko Demontia", "653 Egyptian Dr", "970-456-7548", "nikodemontia23.student@learndistrict.org", "Sophomore"),
                new Student("Skylar Breeze", "2133 Townhouse Cir", "303-853-4372", "skylarbreeze53.student@learndistrict.org", "Senior"),
                new Faculty("River Swade", "897 Applewood Ct", "720-633-6532", "river.swade@teaching.org", "History", 4318.92, "06/11/2004", "Mon-Fri 1:45 PM - 2:45 PM", "Juniors"),
                new Faculty("Wade Ripple", "1552 Waterfalls Ct", "970-294-5583", "wade.ripple@teaching.org", "Science", 4717.23, "02/28/2012", "Mon-Fri 10:00 AM - 11:00 AM", "Juniors"),
                new Staff("Emelia Swan", "925 Roundhouse Dr", "303-882-8689", "emelia.swan@staffdistrict.org", "Administration", 8996.83, "12/07/2001", "Principal"),
                new Staff("Roger Briner", "892 Oldman Cir", "720-864-4837", "roger.briner@staffdistrict.org", "Maintenance", 4269.45, "05/23/2021", "Certified Maintenance Technician"),
        };

        for (Person person : credentials) {
            System.out.println(person.toString());
            System.out.println(" ");
        }

        TestSchoolRecords.employeesOnly(credentials);
    }

    public static Person[] employeesOnly(Person[] credentials) {

        int i = 0;
        Person[] employees = new Person[credentials.length];
        for (Person person : credentials) {
            if (person instanceof Employee) {
                employees[i] = person;
                i++;
            }
        }
        return employees;
    }
}