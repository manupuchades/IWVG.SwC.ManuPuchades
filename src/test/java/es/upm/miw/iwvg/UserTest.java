package es.upm.miw.iwvg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    private User testUser;
    private User testUpperCaseUser;
    private User testLowerCaseUser;

    @BeforeEach
    void before() {
        testUser = new User(1, "Nombre", "Apellidos");
        testUpperCaseUser = new User(1, "NOMBRE", "APELLIDOS");
        testLowerCaseUser = new User(1, "nombre", "apellidos");
    }

    @Test
    void testNewUser() {
        assertEquals(1, testUser.getNumber());
        assertEquals("Nombre", testUser.getName());
        assertEquals("Apellidos", testUser.getFamilyName());

        assertEquals(1, testUpperCaseUser.getNumber());
        assertEquals("Nombre", testUpperCaseUser.getName());
        assertEquals("Apellidos", testUpperCaseUser.getFamilyName());

        assertEquals(1, testLowerCaseUser.getNumber());
        assertEquals("Nombre", testLowerCaseUser.getName());
        assertEquals("Apellidos", testLowerCaseUser.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Nombre Apellidos", testUser.fullName());
        assertEquals("Nombre Apellidos", testUpperCaseUser.fullName());
        assertEquals("Nombre Apellidos", testLowerCaseUser.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("N.", testUser.initials());
        assertEquals("N.", testUpperCaseUser.initials());
        assertEquals("N.", testLowerCaseUser.initials());
    }

    @Test
    void testSet(){
        Integer oldNumber = testUser.getNumber();
        String oldName = testUser.getName();
        String oldFamilyName = testUser.getFamilyName();

        testUser.setNumber(2);
        testUser.setName("Daniel");
        testUser.setFamilyName("Perez");

        assertNotEquals(oldNumber, testUser.getNumber());
        assertNotEquals(oldName, testUser.getName());
        assertNotEquals(oldFamilyName, testUser.getFamilyName());
    }
}


