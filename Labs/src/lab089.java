public class lab089 {
    public class TimeSpan {
        private int hours;
        private int minutes;

        public void add(int hours, int minutes) { ... }
        public int getHours() { ... }
        public int getMinutes() { ... }
        public String toString() { ... }

        public void scale(int factor) {
            this.hours = this.minutes * factor / 60 + factor * this.hours;
            this.minutes = this.minutes * factor % 60;
        }
    }
}
