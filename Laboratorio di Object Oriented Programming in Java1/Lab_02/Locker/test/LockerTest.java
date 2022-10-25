import org.junit.Assert;
import org.junit.Test;

public class LockerTest {
    @Test
    public void openLock(){
        Locker lock = new Locker();
        lock.newComb("ciao");
        Assert.assertEquals(true, lock.isOpen());
        lock.lock();
        Assert.assertEquals(false, lock.isOpen());
        lock.newComb("nope");
        lock.unlock("nope");
        Assert.assertEquals(false, lock.isOpen());
        lock.unlock("ciao");
        Assert.assertEquals(true, lock.isOpen());
    }
}