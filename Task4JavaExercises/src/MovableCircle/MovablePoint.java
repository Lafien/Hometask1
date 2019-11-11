package MovableCircle;

import java.util.Objects;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp(){
        this.y+=ySpeed;
    }

    @Override
    public void moveDown(){
        this.y-=ySpeed;
    }

    @Override
    public void moveLeft(){
        this.x-=xSpeed;
    }

    @Override
    public void moveRight(){
        this.x+=xSpeed;
    }

    @Override
    public String toString() {
        return "Point[(" + x + "," + y + "),Speed(" + xSpeed + "," + ySpeed + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovablePoint that = (MovablePoint) o;
        return x == that.x &&
                y == that.y &&
                xSpeed == that.xSpeed &&
                ySpeed == that.ySpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, xSpeed, ySpeed);
    }
}
