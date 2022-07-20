import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Lightscape {
    private ArrayList<Point> points;
    private Vector2 min;
    private Vector2 max;

    public Lightscape(ArrayList<Point> points) {
        this.points = points;
        computeMinMax();
    }

    public Vector2 getMin() {
        return min;
    }

    public Vector2 getMax() {
        return max;
    }

    public Vector2 getSize() {
        return new Vector2(-min.getX() + max.getX(), -min.getY() + max.getY());
    }

    public void advance() {
        for (Point p : points) {
            p.advance();
        }

        computeMinMax();
    }

    public void rewind() {
        for (Point p : points) {
            p.rewind();
        }

        computeMinMax();
    }

    private void computeMinMax() {
        // Compute new min and max coordinates for the lightscape
        min = new Vector2(0, 0);
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
        }
    }

    public Vector2 print() {
        // To print, we figure out where the points currently are and what spaces are currently empty.
        Set<Vector2> lights = new HashSet<>();

        for (Point p : points) {
            lights.add(p.getLocation());
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

        // Return the grid size so the caller
        return new Vector2(-min.getX() + max.getX(), -min.getY() + max.getY());
    }
}
