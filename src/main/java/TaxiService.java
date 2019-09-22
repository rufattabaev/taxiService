public class TaxiService {
    int count(int boardingCost, int kilometerCost, int distance) {
        int totalCost = boardingCost + (kilometerCost * distance);
        int discount = (int) (totalCost - (totalCost * 0.95));
        if (totalCost < 1000) {
            totalCost = totalCost;
        } else if (totalCost >= 1000 && discount <= 100) {
            totalCost = totalCost - discount;
        } else {
            totalCost = totalCost - 100;
        }
        return totalCost;
    }
}
