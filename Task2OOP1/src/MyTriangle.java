import java.util.Objects;

public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
    }


    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]";
    }

    public double getPerimetr(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTriangle that = (MyTriangle) o;
        return Objects.equals(v1, that.v1) &&
                Objects.equals(v2, that.v2) &&
                Objects.equals(v3, that.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }

    public String getType(){
        if(v1.distance(v2)==v2.distance(v3) && v1.distance(v2)==v1.distance(v3)){
            return "Equilateral";
        } else if(v1.distance(v2)==v2.distance(v3) || v1.distance(v2)==v1.distance(v3) || v2.distance(v3)==v1.distance(v3)) {
            return "Isosceles";
        } else
        return "Scalene";
    }
}
