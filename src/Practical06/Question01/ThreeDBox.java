package Practical06.Question01;

public class ThreeDBox {
    private int depth;
    private Box box;

    public ThreeDBox() {
        this.depth = -1;
        this.box = new Box();
    }

    public ThreeDBox(int width, int height, int depth) {
        this.depth = depth;
        this.box = new Box(width, height);
    }

    public ThreeDBox(ThreeDBox threeDBox) {
        this.depth = threeDBox.depth;
        this.box = new Box(threeDBox.box);
    }

    public int volume() {
        return box.volume() * depth;
    }
}
