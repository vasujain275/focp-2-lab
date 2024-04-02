package Practical06.Question08;

public class Main {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(10);
        System.out.println(rc.getPerimeter());
        System.out.println(rc.getArea());
        rc.resize(50);
        System.out.println(rc.getPerimeter());
        System.out.println(rc.getArea());
    }

}
