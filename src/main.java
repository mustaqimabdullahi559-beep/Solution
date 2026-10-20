import java.util.ArrayList;
import java.util.Scanner;

public class main {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            ArrayList<Delivery> deliveries = new ArrayList<>();

            int count;

            do {
                System.out.print("How many deliveries? ");
                count = input.nextInt();
            } while (count < 1 || count > 100);

            for (int i = 1; i <= count; i++) {

                System.out.print("Delivery " + i + " - type (R/E): ");
                String type = input.next().toUpperCase();

                while (!type.equals("R") && !type.equals("E")) {
                    System.out.print("Enter R or E: ");
                    type = input.next().toUpperCase();
                }

                int distance;
                do {
                    System.out.print("Delivery " + i + " - distance (km): ");
                    distance = input.nextInt();
                } while (distance < 1 || distance > 1000);

                int weight;
                do {
                    System.out.print("Delivery " + i + " - weight (kg): ");
                    weight = input.nextInt();
                } while (weight < 1 || weight > 1000);

                if (type.equals("R")) {
                    deliveries.add(new RegularlyDelivery(distance, weight));
                } else {
                    deliveries.add(new ExpressDelivery(distance, weight));
                }
            }

            long total = 0;

            System.out.println("\n--- DELIVERY FEE SUMMARY ---");

            for (int i = 0; i < deliveries.size(); i++) {
                long fee = deliveries.get(i).calculateFee();
                total += fee;

                System.out.println("Delivery " + (i + 1) + ": "
                        + fee + " units");
            }

            System.out.println("Total delivery fees: " + total + " units");

            input.close();
        }

}
