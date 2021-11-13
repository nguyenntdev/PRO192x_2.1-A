public class lab086 {
    public class Point {
        private int x;
        private int y;

        public boolean isCollinear(Point p1, Point p2) {
            if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
                return true;
            } else {
                double slope1 = (double)(this.y - p1.y) / (double)(this.x - p1.x);
                double slope2 = (double)(this.y - p2.y) / (double)(this.x - p2.x);
                return slope1 == slope2;
            }
        }
    }
}
