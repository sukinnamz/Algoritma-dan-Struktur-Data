public class Dragon15 {
    int x = 0, y = 0, width = 15, height = 15;

    void moveLeft() {
        x--;
        printPosisition();
        if (x < 0 || x > width) {
            detectCollison(x, y);
        }
    }

    void moveRight() {
        x++;
        printPosisition();
        if (x < 0 || x > width) {
            detectCollison(x, y);
        }
    }

    void moveUp() {
        y++;
        printPosisition();
        if (y < 0 || y > width) {
            detectCollison(x, y);
        }
    }

    void moveDown() {
        y--;
        printPosisition();
        if (y < 0 || y > width) {
            detectCollison(x, y);
        }
    }

    void detectCollison(int x, int y) {
        System.out.println("Game over");
    }

    void printPosisition() {
        System.out.printf("Position : (%d, %d)\n", x, y);
    }
}
