package pustovit.homework.homework_31.service;

import lombok.SneakyThrows;
import org.junit.jupiter.api.*;
import pustovit.homework.homework_31.exception.WrongEmailException;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    private final EmailService emailService = new EmailService();

    @BeforeEach
    void setUp() {
        System.out.println("Run before each tests");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Run after each tests");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Run before ALL tests");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Run after ALL tests");
    }

    @Test
    void validateIfEmailIsNullTest() {
        final WrongEmailException wrongEmailException = assertThrows(
                WrongEmailException.class,
                () -> emailService.validate(null)
        );

        assertEquals("email is null or empty", wrongEmailException.getMessage());
    }

    @Test
    void validateIfEmailIsEmptyTest() {
        final WrongEmailException wrongEmailException = assertThrows(
                WrongEmailException.class,
                () -> emailService.validate("")
        );

        assertEquals("email is null or empty", wrongEmailException.getMessage());
    }

    @SneakyThrows
    @Test
    void validateIfEmailFormatIsCorrectTest() {
        final String email = "ihor@gmail.com";
        final boolean validate = emailService.validate(email);

        assertTrue(validate, String.format("%s is incorrect", email));

    }

    @SneakyThrows
    @Test
    void validateIfEmailFormatIsIncorrectTest() {
        final String email = "ihor";
        final boolean validate = emailService.validate(email);

        assertFalse(validate, String.format("%s is correct", email));
    }

}