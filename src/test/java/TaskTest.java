import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    private Task task = new Task();


    @Test
    void sum() {
        task.setFloors(30);
        task.setPriceUp(1000);
        task.setEveryFloor(10);
        task.setPrice(10000);
        task.setSumOfPiece(task.getFloors());

        assertEquals(330000, task.sumFromSellFlats());
    }

    @Test
    void sum1() {
        task.setFloors(42);
        task.setPriceUp(2000);
        task.setEveryFloor(7);
        task.setPrice(6000);
        task.setSumOfPiece(task.getFloors());

        assertEquals(462000, task.sumFromSellFlats());
    }

    @Test
    void sum2() {
        task.setFloors(20);
        task.setPriceUp(1000);
        task.setEveryFloor(5);
        task.setPrice(10000);
        task.setSumOfPiece(task.getFloors());

        assertEquals(230000, task.sumFromSellFlats());
    }
}