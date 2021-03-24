import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndUnderLimit() {

                BonusService service = new BonusService();

                long amount =1000_60;
                boolean registered = true;
                long expected =30;

                long actual = service.calculate(registered, amount);

                assertEquals(expected, actual);
            }
    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndOverLimit() {

        BonusService service = new BonusService();

        long amount =1000_000_60;
        boolean registered = true;
        long expected =500;

        long actual = service.calculate(registered, amount);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndUnderLimit() {

        BonusService service = new BonusService();

        long amount =1000_60;
        boolean registered = false;
        long expected =10;

        long actual = service.calculate(registered, amount);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndOverLimit() {

        BonusService service = new BonusService();

        long amount =1000_000_60;
        boolean registered = false;
        long expected =500;

        long actual = service.calculate(registered, amount);

        assertEquals(expected, actual);
    }

    }



