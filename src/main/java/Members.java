import java.util.List;

public class Members {

    public List<Person> members;

    public add(Person p) {
        members.add(p);
    }
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.toString();
            }
        }
    }

    public static void printPersonsWithinAgeRange(
            List<Person> members, int low, int high) {
        for (Person p : members) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.toString();
            }
        }
    }

    public static void printPersons(
            List<Person> members, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
