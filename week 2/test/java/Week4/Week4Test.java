package Week4;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestCase;

public class Week4Test extends TestCase{
    private int a , b;
    private int[] arr1 = new int[100];
    private double weight ;
    private double height ;
    private Week4 week4;
    
    @Test
    public void testMax2Int1() {
        a = 4;
        b = 2;
        week4 = new Week4();
        assertEquals(4 ,week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int2() {
        a = 5;
        b = 15;
        week4 = new Week4();
        assertEquals(15 ,week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int3() {
        a = 0;
        b = 0;
        week4 = new Week4();
        assertEquals(0 ,week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int4() {
        a = 1;
        b = 0;
        week4 = new Week4();
        assertEquals(1, week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int5() {
        a = 4;
        b = 2;
        week4 = new Week4();
        assertEquals(4, week4.max2Int(a,b));
    }

    @Test
    public void testMinArray1(){
        arr1 = new int[]{4,1,2,0,2};
        week4 = new Week4();
        assertEquals(0, week4.minArray(arr1));
    }

    @Test
    public void testMinArray2(){
        arr1 = new int[]{2,3,7,9,122,1};
        week4 = new Week4();
        assertEquals(1, week4.minArray(arr1));
    }

    @Test
    public void testMinArray3(){
        arr1 = new int[]{0,2,1,4,5,0};
        week4 = new Week4();
        assertEquals(0, week4.minArray(arr1));
    }

    @Test
    public void testMinArray4(){
        arr1 = new int[]{1, 1,1};
        week4 = new Week4();
        assertEquals(1, week4.minArray(arr1));
    }

    @Test
    public void testMinArray5(){
        arr1 = new int[]{1};
        week4 = new Week4();
        assertEquals(1, week4.minArray(arr1));
    }

    @Test
    public void testCalculateBMI1(){
        weight = 45.0;
        height  = 1.4;
        week4 = new Week4();
        assertEquals("Béo phì", week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI2(){
        weight = 53.1;
        height  = 1.4;
        week4 = new Week4();
        assertEquals("Béo phì", week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI3(){
        weight = 64.0;
        height  = 1.8;
        week4 = new Week4();
        assertEquals("Bình thường", week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI4(){
        weight = 0;
        height  = 0;
        week4 = new Week4();
        assertEquals("Không hợp lệ", week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI5(){
        weight = 70.4;
        height  = 1.4;
        week4 = new Week4();
        assertEquals("Béo phì", week4.calculateBMI(weight, height));
    }

    public static void main(String [] args) {  
        Result result = JUnitCore.runClasses(Week4Test.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }  

}
