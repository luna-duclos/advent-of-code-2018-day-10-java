import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Lightscape {
    private ArrayList<Point> points;


    public Lightscape(ArrayList<Point> points) {
        this.points = points;
    }

    public void advance() {
        for (Point p : points) {
            p.advance();
        }
    }

    public void print() {
        // To print, we figure out where the points currently are and what spaces are currently empty.
        Set<Vector2> lights = new HashSet<>();

        Vector2 min = new Vector2(0, 0),
                max = new Vector2(0, 0);

        for (Point p : points) {
            Vector2 loc = p.getLocation();

            if (min.getX() > loc.getX())
                min.setX(loc.getX());
            if (min.getY() > loc.getY())
                min.setY(loc.getY());

            if (max.getX() < loc.getX())
                max.setX(loc.getX());
            if (max.getY() < loc.getY())
                max.setY(loc.getY());

            lights.add(loc);
        }

        // We now have a min, max and a list of locations, we can print our grid
        for (int y = min.getY(); y <= max.getY(); y++) {
            for (int x = min.getX(); x <= max.getX(); x++) {
                if (lights.contains(new Vector2(x, y))) {
                    System.out.print('#');
                } else {
                    System.out.print('.');
                }
            }

            System.out.println("");
        }
    }
}
