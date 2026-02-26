import org.junit.*;
public class abcTest {
    @Test 
    public void testAddNumbers() {
        abc add_var=new abc();
        Assert.assertEquals(7,add_var.addnumbers(2, 5));
        Assert.assertEquals(-7,add_var.addnumbers(-2, -5));
        Assert.assertEquals(5,add_var.addnumbers(0, 5));
    }

}
