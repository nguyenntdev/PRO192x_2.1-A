public class lab085 {
    public class Point {
        private int x;
        private int y;

        public double slope(Point p) {
            if (this.x == p.x) {
                throw new IllegalArgumentException();
            } else {
                double dy = (double)(this.y - p.y);
                double dx = (double)(this.x - p.x);
                return dy / dx;
            }
        }
    }
}
