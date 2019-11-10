public class CalculationDistanceService {
    public int calculate(double consumption, double fuelValue) {
        if (fuelValue == 0) {
            return 0;
        }
        return (int)(fuelValue * 100 / consumption);
    }

}
