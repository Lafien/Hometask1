package GeometricObject;

import java.util.Objects;

public class Circle implements GeometricObject{
    protected double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
