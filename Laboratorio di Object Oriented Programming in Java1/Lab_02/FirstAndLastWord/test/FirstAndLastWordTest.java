import org.junit.Assert;
import org.junit.Test;


import java.util.*;

public class FirstAndLastWordTest {
    @Test
    public void provaSort(){
        List<String> lst = new ArrayList<>();
        lst.add("ciao");
        lst.add("Come");
        lst.add("va");
        lst.add("tutto");
        FirstAndLastWord flWord = new FirstAndLastWord(lst);
        flWord.sort();
        Assert.assertEquals("Come", flWord.getFirst());
        Assert.assertEquals("va", flWord.getLast());
    }
    @Test
    public void provaSortIgnore(){
        List<String> lst = new ArrayList<>();
        lst.add("ciao");
        lst.add("Come");
        lst.add("va");
        lst.add("tutto");
        FirstAndLastWord flWord = new FirstAndLastWord(lst);
        flWord.sortIgnoreCase();
        Assert.assertEquals("ciao", flWord.getFirst());
        Assert.assertEquals("va", flWord.getLast());
    }

}