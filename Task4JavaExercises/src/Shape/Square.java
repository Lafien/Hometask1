package Shape;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        this.setLength(side);
        this.setWidth(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    public double getArea(){
        return getSide()*getSide();
    }

    public double getPerimeter(){
        return getSide()*4;
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + ",color=" + super.getColor() + ",filled=" + super.isFilled() + "]";
    }
}
