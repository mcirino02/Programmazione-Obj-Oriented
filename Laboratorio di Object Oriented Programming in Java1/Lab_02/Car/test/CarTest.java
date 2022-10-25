import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void newCar (){
        Car car = new Car(0.5);
        car.addGas(10);
        Assert.assertEquals(10, car.getGas(), 0);
    }
    @Test
    public void driveCar (){
        Car car = new Car(0.5);
        car.addGas(10);
        car.drive(10);
        Assert.assertEquals(5, car.getGas(), 0);
    }
}