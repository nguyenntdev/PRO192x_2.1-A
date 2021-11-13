public class lab088 {
    public class TimeSpan {
        private int hours;
        private int minutes;

        public void add(int hours, int minutes) { ... }
        public int getHours() { ... }
        public int getMinutes() { ... }
        public String toString() { ... }

        public void subtract(TimeSpan span) {
            int min1 = this.hours * 60 + this.minutes;
            int min2 = span.hours * 60 + span.minutes;
            int diff = min1 - min2;
            this.hours = diff / 60;
            this.minutes = diff % 60;
        }
    }
}
