import org.junit.Assert;
import org.junit.Test;

public class InputCheckerTest {
    @Test
    public void accepted(){
        InputChecker inCheck = new InputChecker();
        Assert.assertEquals("OK", inCheck.checkInput("S"));
        Assert.assertEquals("OK", inCheck.checkInput("perchè no?"));
    }
    @Test
    public void negative(){
        InputChecker inCheck = new InputChecker();
        Assert.assertEquals("FINE", inCheck.checkInput("N"));
        Assert.assertEquals("FINE", inCheck.checkInput("NO"));
    }
    @Test
    public void others(){
        InputChecker inCheck = new InputChecker();
        Assert.assertEquals("DATO NON CORRETTO", inCheck.checkInput("ciao"));
    }
}