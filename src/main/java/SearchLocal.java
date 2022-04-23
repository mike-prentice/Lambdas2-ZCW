import Person.Person;

import java.util.List;

public class SearchLocal implements CheckPerson {

    public static String searchLocal(List<Person> roster) {
        return printPersons(roster, new SearchLocal());
    }

    public static String printPersons(
        List<Person> members, CheckPerson tester) {
        String output = "";
        for (Person p : members) {
            if (tester.test(p)) {
                output += p.toString();
            }
        }
        return output;
    }

    @Override
    public boolean test(Person person) {
        return person.getAge() >= 18;
    }
}
