import Person.Person;

import java.util.List;

public class SearchLambda {
    public static String searchLambda(List<Person> roster) {
        return printPersons(roster, p -> p.getAge() >= 18);
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
}
