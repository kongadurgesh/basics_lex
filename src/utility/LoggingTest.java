package utility;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest {
    private static final Logger LOGGER = Logger.getLogger(LoggingTest.class.getName());

    public double divide(float x, float y) throws ArithmeticException {
        try {
            if (y == 0) {
                LOGGER.log(Level.WARNING, "Divisor can not be zero", new Throwable("Test"));
            }
            return x / y;
        } catch (ArithmeticException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e.getMessage());
        }
        return 0;
    }
}
