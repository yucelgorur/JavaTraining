package geometricareacalculation;

public class Square extends Shape{
    private int rim;

    public Square(String name, int rim) {
        super(name);
        this.rim = rim;
    }

    @Override
    void calculateArea() {
        System.out.println(getName() + " in alanı: " + (rim * rim));
    }




}
