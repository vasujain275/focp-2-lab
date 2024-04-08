package Practical06.Question01;

public class Shipment {
    private int cost;
    private ThreeDBox threeDBox;

    public Shipment() {
        this.cost = -1;
        this.threeDBox = new ThreeDBox();
    }

    public Shipment(int width, int height, int depth, int cost) {
        this.cost = cost;
        this.threeDBox = new ThreeDBox(width, height, depth);
    }

    public Shipment(Shipment shipment) {
        this.cost = shipment.cost;
        this.threeDBox = new ThreeDBox(shipment.threeDBox);
    }

    public void display() {
        System.out.println("Volume: " + threeDBox.volume());
        System.out.println("Cost: " + cost);
    }
}
