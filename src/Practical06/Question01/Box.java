package Practical06.Question01;

public class Box {
    private int width;
    private int height;

    public Box() {
        this.width = -1;
        this.height = -1;
    }

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
    }

    public int volume() {
        return width * height;
    }
}
