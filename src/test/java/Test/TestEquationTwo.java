package Test;

import EquationTwoPackage.EquationTwo;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;


public class TestEquationTwo {

    @Test
    public void QuadraticEquationOne() {
        EquationTwo test = new EquationTwo(5, 0, 0);
        double[] n = {0};

        Assert.assertArrayEquals(n, new double[]{test.largerRoot()}, 0.000001);
    }
   @Test
   public void QuadraticEquationTwo() {
       EquationTwo test = new EquationTwo(2,-4,0);
       double[] n = {2};

       Assert.assertArrayEquals(n, new double[]{test.largerRoot()}, 0.000001);
   }

    @Test(expected = IllegalArgumentException.class)
    public void QuadraticEquationTree() throws IllegalArgumentException {
        EquationTwo test = new EquationTwo(0,5446546,-9465465);
        fail();
        //assertEquals("Корней нет",test.largerRoot());
    }
}
