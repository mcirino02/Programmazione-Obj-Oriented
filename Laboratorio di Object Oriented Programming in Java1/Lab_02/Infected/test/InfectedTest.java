import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {

    @Test
    public void newDisease(){
        Infected inf = new Infected("Covid");
        Assert.assertEquals("Covid", inf.getDisease());
    }

    @Test
    public void infectedPeople(){
        Infected inf = new Infected("Covid", 200);
        Assert.assertEquals(200, inf.getNumberOfInfected(), 0);
        Assert.assertEquals("Covid", inf.getDisease());
    }
    @Test
    public void moreInfected(){
        Infected inf = new Infected("Covid", 200);
        inf.addInfected(300);
        Assert.assertEquals(500, inf.getNumberOfInfected(), 0);
    }
    @Test
    public void rtChange (){
        Infected inf = new Infected("Covid", 200);
        inf.updateInfectedByRt(1.4);
        Assert.assertEquals(1.4, inf.getRt(), 0.0);
    }
}