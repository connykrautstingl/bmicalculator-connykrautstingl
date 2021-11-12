import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {


    @BeforeEach
    void setUp() {

        BMICalculator maxMustermann = new BMICalculator("Max", "Mustermann", 'm', 180, 80.0);
        BMICalculator susiSorglos = new BMICalculator("Susi", "Sorglos", 'w',174, 52.0);
        BMICalculator johnDoe = new BMICalculator("John", "Doe", 'm', 202, 114.0);
    }

    @Test
    void calculateBMI() {


    }

    @Test
    void calculateBMICategory() {
    }

    @Test
    void getBMICategoryName() {
    }
}