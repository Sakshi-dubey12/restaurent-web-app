public class DeliveryCostCalculator {

    public static double calculateDeliveryCharge(double distance) {
        double baseCharge = 50.0; // Base charge for distances under 10km
        double charge;

        if (distance <= 10) {
            charge = baseCharge;
        } else {
            // Calculate the increased charge for distances over 10km
            double additionalDistance = distance - 10;
            double incrementPercentage = 0.30; // 30% increase per 10km increment
            double increments = Math.ceil(additionalDistance / 10);
            charge = baseCharge * Math.pow(1 + incrementPercentage, increments);
        }

        return charge;
    }

    public static void main(String[] args) {
        // Example distances to calculate delivery charges for
        double[] distances = {5, 10, 15, 20, 25, 30};

        for (double distance : distances) {
            double charge = calculateDeliveryCharge(distance);
            System.out.printf("Distance: %.2f km - Delivery Charge: Rs. %.2f%n", distance, charge);
        }
    }
}
