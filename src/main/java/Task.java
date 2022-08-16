public class Task {
    private static int floors;
    private static int priceUp;
    private static int everyFloor;
    private static int price;
    private static int sumOfPiece;

    public int sumFromSellFlats() {
        int sum = sumOfPiece * everyFloor * (((price) + (priceUp * (sumOfPiece - 1)) / 2));
        return sum;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getPriceUp() {
        return priceUp;
    }

    public void setPriceUp(int priceUp) {
        this.priceUp = priceUp;
    }

    public int getEveryFloor() {
        return everyFloor;
    }

    public void setEveryFloor(int everyFloor) {
        this.everyFloor = everyFloor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSumOfPiece() {
        return sumOfPiece;
    }

    public void setSumOfPiece(int sumOfPiece) {
        this.sumOfPiece = floors/everyFloor;
    }
}