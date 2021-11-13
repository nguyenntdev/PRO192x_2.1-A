public class lab083 {

    public class Point {
        private int x;
        private int y;

        public int manhattanDistance(Point p) {
            int a = this.x - p.x;
            int b = this.y - p.y;
            return Math.abs(a) + Math.abs(b);
        }
    }
}
