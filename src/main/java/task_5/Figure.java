package task_5;

public abstract class Figure {
    String color;
    float x;
    float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract float getPerimeter();
    public abstract float getArea();
}
