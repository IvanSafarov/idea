package semestr2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPhoneBook {
    private Map<Human, ArrayList<String>> expected = new HashMap<>();
    private Map<Human, ArrayList<String>> actual = new HashMap<>();
    private PhoneBook phoneBook;
    private Human people1 = new Human("Ivanov", "Dmitry", "Alexandrovich", 40);
    private Human people2 = new Human("Ivanov", "Vasiliy", "Pavlovich", 10);
    private Human people3 = new Human("Petrov", "Ivan", "Viktorovich", 45);
    private String firstPhone1 = "123456";
    private String firstPhone2 = "123456789";
    private String firstPhone3 = "1111111";
    private String secondPhone1 = "1345622";
    private String thirdPhone1 = "10101010";
    private String thirdPhone2 = "222222";
    ArrayList<String> expectedList = new ArrayList<String>();
    ArrayList<String> actualList = new ArrayList<String>();
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    ArrayList<String> list3 = new ArrayList<String>();

    @BeforeEach
    public void setup() {
        Collections.addAll(expectedList, firstPhone1, firstPhone2, firstPhone3);
        expected.put(people1, expectedList);
        Collections.addAll(actualList, firstPhone1, firstPhone2);
        actual.put(people1, actualList);
        phoneBook = new PhoneBook(actual);
    }

    @Test
    public void testAddPhone() {
        PhoneBook expectedPhoneBook = new PhoneBook(expected);
        phoneBook.addPhone(people1, firstPhone3);
        assertEquals(expectedPhoneBook, phoneBook);
    }

    @Test
    public void testDeletePhone() {
        PhoneBook expectedPhoneBook = new PhoneBook(expected);
        Collections.addAll(actualList, firstPhone1, firstPhone2, firstPhone3);
        actual.put(people1, actualList);
        phoneBook = new PhoneBook(actual);
        phoneBook.deletePhone(people1, firstPhone3);
        assertEquals(expectedPhoneBook, phoneBook);
    }

    @Test
    public void testGetHuman() {
        Collections.addAll(actualList, firstPhone1, firstPhone2, firstPhone3);
        Collections.addAll(list3, thirdPhone1, thirdPhone2);
        actual.put(people1, actualList);
        actual.put(people3, list3);
        phoneBook = new PhoneBook(actual);
        assertEquals(people1, phoneBook.getHuman(firstPhone2));
    }

    @Test
    public void testGetHumanException() {
        Collections.addAll(actualList, firstPhone1, firstPhone2);
        Collections.addAll(list3, thirdPhone1, thirdPhone2);
        actual.put(people1, actualList);
        actual.put(people3, list3);
        phoneBook = new PhoneBook(actual);
        assertThrows(IllegalArgumentException.class, () -> phoneBook.getHuman(firstPhone3));
    }

    @Test
    public void testListPhonesHuman() {
        Collections.addAll(actualList, firstPhone1, firstPhone2);
        Collections.addAll(list3, thirdPhone1, thirdPhone2);
        actual.put(people1, actualList);
        actual.put(people3, list3);
        phoneBook = new PhoneBook(actual);
        assertEquals(list3, phoneBook.listPhonesHuman(people3));
    }

    @Test
    public void testListPhonesHumanException() {
        Collections.addAll(actualList, firstPhone1, firstPhone2);
        Collections.addAll(list3, thirdPhone1, thirdPhone2);
        actual.put(people1, actualList);
        actual.put(people3, list3);
        phoneBook = new PhoneBook(actual);
        assertThrows(IllegalArgumentException.class, () -> phoneBook.listPhonesHuman(people2));
    }
}
