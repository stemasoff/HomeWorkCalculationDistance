import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationDistanceServiceTest {

    @Test
    void calculate() {
        CalculationDistanceService car = new CalculationDistanceService();
        double fuelValue = 20;
        double consumption = 10;
        assertEquals(200, car.calculate(consumption, fuelValue));
    }

    @Test
    void calculateZeroValue() {
        CalculationDistanceService car = new CalculationDistanceService();
        double fuelValue = 0;
        double consumption = 10;
        assertEquals(0, car.calculate(consumption, fuelValue));
    }
}