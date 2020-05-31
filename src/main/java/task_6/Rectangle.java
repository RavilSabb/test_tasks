package task_6;

import task_5.Figure;

public class Rectangle extends Figure {
    private float width;
    private float heigth;

    Rectangle(float x, float y, float width, float heigth) {

        super(x, y);
        this.width = width;
        this.heigth = heigth;
    }


    public float getPerimeter() {
        return width * 2 + heigth * 2;
    }

    public float getArea() {
        return width * heigth;
    }
}
