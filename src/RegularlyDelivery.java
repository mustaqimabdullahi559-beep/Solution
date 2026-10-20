public class RegularlyDelivery  extends Delivery{

        public RegularlyDelivery(int distance, int weight) {
            super(distance, weight);
        }

        @Override
        public long calculateFee() {
            return 10 + 2L * distance + weight;
        }
    }

