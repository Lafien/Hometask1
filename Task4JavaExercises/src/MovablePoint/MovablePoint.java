package MovablePoint;

import java.util.Objects;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpee(){
        float[] result = new float[2];
        result[0]=xSpeed;
        result[1]=ySpeed;
        return result;
    }

    @Override
    public String toString() {
        return super.toString()+ ",speed=(" + xSpeed + "," + ySpeed + ")";
    }

    public MovablePoint move(){
        this.setX(this.getX()+xSpeed);
        this.setY(this.getY()+ySpeed);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MovablePoint that = (MovablePoint) o;
        return Float.compare(that.xSpeed, xSpeed) == 0 &&
                Float.compare(that.ySpeed, ySpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), xSpeed, ySpeed);
    }
}
