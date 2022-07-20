import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Puzzle found at https://adventofcode.com/2018/day/10
        // Problem statement and starting state are found there
        /*
position=<-3,  6> velocity=< 2, -1>
         */
        Lightscape s = new Lightscape(new ArrayList<Point>(Arrays.asList(new Point[]{
                new Point(new Vector2(9, 1), new Vector2(0, 2)),
                new Point(new Vector2(7, 0), new Vector2(-1, 0)),
                new Point(new Vector2(3, -2), new Vector2(-1, 1)),
                new Point(new Vector2(6, 10), new Vector2(-2, -1)),
                new Point(new Vector2(2, -4), new Vector2(2, 2)),
                new Point(new Vector2(-6, 10), new Vector2(2, -2)),
                new Point(new Vector2(1, 8), new Vector2(1, -1)),
                new Point(new Vector2(1, 7), new Vector2(1, 0)),
                new Point(new Vector2(-3, 11), new Vector2(1, -2)),
                new Point(new Vector2(7, 6), new Vector2(-1, -1)),
                new Point(new Vector2(-2, 3), new Vector2(1, 0)),
                new Point(new Vector2(-4, 3), new Vector2(2, 0)),
                new Point(new Vector2(10, -3), new Vector2(-1, 1)),
                new Point(new Vector2(5, 11), new Vector2(1, -2)),
                new Point(new Vector2(4, 7), new Vector2(0, -1)),
                new Point(new Vector2(8, -2), new Vector2(0, 1)),
                new Point(new Vector2(15, 0), new Vector2(-2, 0)),
                new Point(new Vector2(1, 6), new Vector2(1, 0)),
                new Point(new Vector2(8, 9), new Vector2(0, -1)),
                new Point(new Vector2(3, 3), new Vector2(-1, 1)),
                new Point(new Vector2(0, 5), new Vector2(0, -1)),
                new Point(new Vector2(-2, 2), new Vector2(2,0)),
                new Point(new Vector2(5, -2), new Vector2(1, 2)),
                new Point(new Vector2(1, 4), new Vector2(2, 1)),
                new Point(new Vector2(-2,  7), new Vector2(2, -2)),
                new Point(new Vector2(3,  6), new Vector2(-1, -1)),
                new Point(new Vector2(5,  0), new Vector2(1,  0)),
                new Point(new Vector2(-6,  0), new Vector2(2,  0)),
                new Point(new Vector2(5,  9), new Vector2(1, -2)),
                new Point(new Vector2(14,  7), new Vector2(-2,  0)),
                new Point(new Vector2(-3,  6), new Vector2(2, -1)),
        })));
    }
}