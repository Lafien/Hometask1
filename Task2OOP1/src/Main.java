public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle);
        System.out.println("Circles area: " +circle.getArea());

        Rectangle rectangle = new Rectangle(2.0f,1.0f);
        System.out.println(rectangle);
        System.out.println("Rectangles area: " + rectangle.getArea());
        System.out.println("Rectangles perimetr: "+rectangle.getPerimetr());

        Employee employee = new Employee(1, "Пушкин", "Александр", 99);
        System.out.println(employee);
        System.out.println("Salary + percent: "+employee.raiseSalary(5));


        Author author1 = new Author("Alex", "lifaenka@list.ru", "Male");
        Author author2 = new Author("Kate", "redberd@mail.ru", "Female");
        System.out.println(author1);
        Author[] authors = new Author[2];
        authors[0]=author1;
        authors[1]=author2;
        Book book = new Book("asd", authors, 200);
        System.out.println(book);

        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3,5);
        MyPoint point3 = new MyPoint(6,0);
        int[] array1 = new int[2];
        array1 = point1.getXY();

        System.out.println("Distance: " + point1.distance());
        System.out.println("Distance: " + point1.distance(3, 21));
        System.out.println("Distance: " + point1.distance(point2));

        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);
        MyTriangle triangle2 = new MyTriangle(1,1,2,4,4,0);
        MyTriangle triangle3 = new MyTriangle(-5,10,-1,4,-5,7);
        System.out.println("Perimetr: "+ triangle1.getPerimetr());
        System.out.println("Perimetr: "+ triangle2.getPerimetr());
        System.out.println("Type: " + triangle1.getType());
        System.out.println("Type: " + triangle2.getType());
        System.out.println("Type: " + triangle3.getType());

    }
}
