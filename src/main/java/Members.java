
import java.util.List;

import Person.Person;



public class Members {

    public List<Person> members;

    public void add(Person p) {
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

    public static String printPersons(
            List<Person> members, CheckPerson tester) {
        String output = "";
        for (Person p : members) {
            if (tester.test(p)) {
                output += p;
            }
        }
        return output;
    }
}
