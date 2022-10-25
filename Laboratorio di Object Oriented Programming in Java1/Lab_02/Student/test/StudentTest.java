import org.junit.Assert;
import org.junit.Test;

import java.util.GregorianCalendar;

public class StudentTest {
    @Test
    public void onlyStudent ()
    {
        Student st = new Student("Maurizio", "cirino");
        Assert.assertTrue(st.getExams().isEmpty());
    }


    @Test
    public void oneExam()
    {
        GregorianCalendar gc = new GregorianCalendar(2022, 10, 5);
        Student st = new Student("Maurizio", "cirino");
        Exam ex1 = new Exam("Math", gc, 30);
        st.registerExam(ex1);
        Assert.assertEquals(30, st.computeAverageGrade(), 0);
    }

    @Test
    public void twoExam()
    {
        GregorianCalendar gc = new GregorianCalendar(2022, 10, 5);
        Student st = new Student("Maurizio", "cirino");
        Exam ex1 = new Exam("Math", gc, 25);
        st.registerExam(ex1);
        gc.set(2022, 11, 1);
        Exam ex2 = new Exam("English", gc, 27);
        st.registerExam(ex2);
        Assert.assertEquals(26, st.computeAverageGrade(), 0);
    }





}