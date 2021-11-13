public class lab082 {

    public class Point {
        private int x;
        private int y;

        public void flip() {
            int temp = x;
            x = -y;
            y = -temp;
        }

    }
}
