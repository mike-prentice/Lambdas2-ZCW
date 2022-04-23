import Person.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchAnonTest {

    @Test
    void searchAnon() {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("mike",
            LocalDate.of(1985, 11, 7
            ), Person.Sex.MALE,
            "sdfsdf@test.com");
        personList.add(person1);

        Person person2 = new Person("yun",
            LocalDate.of(1989, 1, 18
            ), Person.Sex.MALE,
            "sthyj@test.com");
        personList.add(person2);

        Person person3 = new Person("merideth",
            LocalDate.of(1997, 9, 3
            ), Person.Sex.FEMALE,
            "sdfgththt@test.com");
        personList.add(person3);

        Person person4 = new Person("miles",
            LocalDate.of(1990, 1, 8
            ), Person.Sex.MALE,
            "sdfeser@test.com");
        personList.add(person4);

        String expected = person1.toString()+person2.toString()+person3.toString()+person4.toString();
        String actual = SearchAnon.searchAnon(personList);

        assertEquals(expected, actual);
    }

    @Test
    void printPersons() {
    }
}
