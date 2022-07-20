public class Point {
    private Vector2 location;
    private Vector2 velocity;

    public Point(Vector2 location, Vector2 velocity) {
        this.location = location;
        this.velocity = velocity;
    }

    public Vector2 getLocation() {
        return location;
    }

    public void setLocation(Vector2 location) {
        this.location = location;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public void advance() {
        location.setX(location.getX() + velocity.getX());
        location.setY(location.getY() + velocity.getY());
    }

    public void rewind() {
        location.setX(location.getX() - velocity.getX());
        location.setY(location.getY() - velocity.getY());
    }
}
