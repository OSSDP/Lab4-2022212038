import org.junit.Assert;
import org.junit.Test;

public class L2022212038_18_Test {
    /*等价类划分原则
        1-只有正整数的num
        2-包含0的num
        3-包含复数的num
        4-只有一个元素的num 预期返回只有一个元素 “1” 的数组
     */
    @Test
    //测试正整数运行情况
    public void Test() {
        int[] num = {1, 2, 3, 4, 5, 4, 2, 3};
        Solution18 sol = new Solution18();
        int[] ans = sol.productExceptSelf(num);
        Assert.assertArrayEquals(ans, new int[]{2880, 1440, 960, 720, 576, 720, 1440, 960});
    }
    @Test
    //测试有0的情况下的运行情况
    public void zeroTest() {
        int[] num = {56, 2, 5, 0 ,1 ,2};
        Solution18 sol = new Solution18();
        int[] ans = sol.productExceptSelf(num);
        Assert.assertArrayEquals(ans, new int[]{0, 0, 0, 1120, 0, 0});
    }
    @Test
    //测试有负数的情况下的运行情况
    public void negativeTest() {
        int[] num = {-2, -3, 4, -5, 6, -7};
        Solution18 sol = new Solution18();
        int[] ans = sol.productExceptSelf(num);
        Assert.assertArrayEquals(ans, new int[]{-2520, -1680, 1260, -1008, 840, -72});
    }
    @Test
    //测试只有num数组只有一个元素时的运行情况
    public void oneNumTest() {
        int[] num = {2};
        Solution18 sol = new Solution18();
        int[] ans = sol.productExceptSelf(num);
        Assert.assertArrayEquals(ans, new int[]{1});
    }

}
//test1
