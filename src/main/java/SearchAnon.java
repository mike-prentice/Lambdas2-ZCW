import Person.Person;

import java.util.List;

public class SearchAnon {
    public static String searchAnon(List<Person> roster) {
        return printPersons(roster, new CheckPerson() {
            @Override
                public boolean test(Person p){
                return p.getAge() >=18;
            }
        });
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
