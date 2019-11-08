import java.util.Objects;

public class MyPoint {
    private int x=0;
    private int y=0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
    }

    public int[] getXY() {
        int[] result = new int[2];
        result[0]=x;
        result[1]=y;
        return result;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+ x + "," + y + ")";
    }

    public double distance(int x, int y) {
        double result = 1.0;
        result = Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
        return  result;
    }

    public double distance(MyPoint another){
        double result = 1.0;
        result = Math.sqrt(Math.pow(another.x-this.x,2)+Math.pow(another.y - this.y,2));
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint point = (MyPoint) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double distance(){
        return (Math.sqrt((x * x + y * y)));
    }
}
