package pustovit.homework.homework_31.service;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pustovit.homework.homework_31.entity.Order;
import pustovit.homework.homework_31.exception.WrongEmailException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderServiceTest {

    private OrderService orderService;
    private EmailService emailService;


    @BeforeEach
    void setUp() {
        emailService = mock(EmailService.class);
        orderService = new OrderService(emailService);
    }


    @SneakyThrows
    @Test
    void createOrderIfValidateSuccess() {
        when(emailService.validate(anyString())).thenReturn(true);

        final Order bob = orderService.create("bob@gmail.com", "bob");

        assertNotNull(bob, "order is null");
        assertEquals(1, bob.getId());
        assertEquals("bob@gmail.com", bob.getEmail());
        assertEquals("bob", bob.getName());

    }

    @SneakyThrows
    @Disabled
    @Test
    void createOrderIfValidateWithException() {
        when(emailService.validate(anyString())).thenThrow(WrongEmailException.class);

        assertThrows(WrongEmailException.class, () -> orderService.create("", "bob"));
    }
}