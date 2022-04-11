import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

@Test
    @org.junit.jupiter.api.Test
    void getName() {
    Person person = new Person("mike");
    String expected = "mike";
    String actual = person.getName();
    Assert.assertEquals(expected, actual);
    }
    @Test
    @org.junit.jupiter.api.Test
    void setName() {
        Person person = new Person("George");
        String expected = "mike";
        person.setName("mike");
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @org.junit.jupiter.api.Test
    void getBirthday() {
        Person person = new Person("mike", LocalDate.of(1985, 12, 07), Person.Sex.MALE, "msasl");
        LocalDate expected = LocalDate.of(1985, 12, 07);
        LocalDate actual = person.getBirthday();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @org.junit.jupiter.api.Test
    void setBirthday() {
        Person person = new Person("mike", LocalDate.of(1984, 12, 07), Person.Sex.MALE, "msasl");
        person.setBirthday(LocalDate.of(2000, 01, 17));
        LocalDate expected =  LocalDate.of(2000, 01, 17);
        LocalDate actual = person.getBirthday();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @org.junit.jupiter.api.Test
    void getGender() {
        Person person = new Person("mike", LocalDate.of(1984, 12, 07), Person.Sex.MALE, "msasl");
        Enum expected = Person.Sex.MALE;
        Enum actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @org.junit.jupiter.api.Test
    void setGender() {
        Person person = new Person("anne", LocalDate.of(1984, 12, 07), Person.Sex.MALE, "msasl");
        person.setGender(Person.Sex.FEMALE);
        Enum expected = Person.Sex.FEMALE;
        Enum actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @org.junit.jupiter.api.Test
    void getEmailAddress() {
        Person person = new Person("anne", LocalDate.of(1984, 12, 07), Person.Sex.MALE, "msasl");
        String expected = "msasl";
        String actual = person.getEmailAddress();
        Assert.assertEquals(expected, actual);
    }
    @Test
    @org.junit.jupiter.api.Test
    void setEmailAddress() {
        Person person = new Person("anne", LocalDate.of(1984, 12, 07), Person.Sex.MALE, "msasl");
        person.setEmailAddress("google");
        String expected = "google";
        String actual = person.getEmailAddress();
    }
    @Test
    @org.junit.jupiter.api.Test
    void getAge() {
        Person person = new Person("anne", LocalDate.of(1984, 12, 07), Person.Sex.MALE, "msasl");
        int expected = 37;
        int actual = person.getAge();
        Assert.assertEquals(expected, actual);

    }
    @Test
    @org.junit.jupiter.api.Test
    void printPerson() {
    }
}