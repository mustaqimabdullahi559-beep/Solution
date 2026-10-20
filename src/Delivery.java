public  abstract class Delivery {


        protected int distance;
        protected int weight;

        public Delivery() {
            this(0, 0);
        }

        public Delivery(int distance, int weight) {
            this.distance = distance;
            this.weight = weight;
        }

        public abstract long calculateFee();

}





