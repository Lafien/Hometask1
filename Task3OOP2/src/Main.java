

public class Main {
    public static void main(String[] args) {
        //Complex
        MyComplex comp1 = new MyComplex(10,-5);
        MyComplex comp2 = new MyComplex(0,7);
        System.out.println("Complex comp1: " + comp1);
        System.out.println("Complex comp2: " + comp2);
        System.out.println("Have comp1 image? " + comp1.isImaginary());
        System.out.println("Have comp2 real? " + comp2.isReal());
        System.out.println("Comp1 equals comp2? " + comp1.equals(comp2));
        System.out.println("Module comp1: " + comp1.magnitude());
        System.out.println("Argument comp2: " + comp2.argument());
        System.out.println("Comp1 + comp2: " + comp1.add(comp2));
        System.out.println("Comp1 + comp2 in new: " + comp1.addNew(comp2));
        System.out.println("Comp1 - comp2: " + comp1.subtract(comp2));
        System.out.println("Comp1 - comp2 in new: " + comp1.subtractNew(comp2));
        System.out.println("Comp1 * comp2: " + comp1.multiply(comp2));
        System.out.println("Comp1 / comp2: " + comp1.divide(comp2));
        System.out.println("Conjugate comp2: " + comp2.conjugate());

        //Polinomial
        MyPolynomial polinom1 = new MyPolynomial(-1,2,3,1,7);
        MyPolynomial polinom2 = new MyPolynomial(1,5,8,3);
        System.out.println("Polinom1: "+ polinom1);
        System.out.println("Polinom2: "+ polinom2);
        System.out.println("Evaluate polinom1 at x=5: "+ polinom1.evaluate(5));
        System.out.println("Polinom1 + polinom2: "+polinom1.add(polinom2));
        System.out.println(polinom1.multiply(polinom2));

        //Ball and container
        Ball ball1 = new Ball(5,2,2, 90,25);
        System.out.println(ball1);
        Container container1 = new Container(0,0,7,5);
        System.out.println(container1);
        System.out.println("Circumference inside the container? "+container1.collidesWidth(ball1));
        ball1.move();
        System.out.println("Ball1 after move: " + ball1);
        System.out.println("Circumference inside the container? "+container1.collidesWidth(ball1));
        ball1.reflectHorizontal();
        System.out.println("Ball1 after reflectHorizontal: " + ball1);
        ball1.reflectVertical();
        System.out.println("Ball1 after reflectVertical: " + ball1);


    }

}
