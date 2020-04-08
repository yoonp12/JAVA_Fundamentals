import java.util.ArrayList;
import java.util.Arrays;
public class BasicJavaTest {
    public static void main(String [] args) {
        BasicJava res = new BasicJava();
        Integer results = res.print1To255();
        System.out.println(results);
        Integer oddResults = res.printOddNums1To255();
        System.out.println(oddResults);
        Object arraySum = res.printSumOfArray();
        System.out.println(arraySum);
        int[] numbers = {1,3,5,7,9,13};
        int[] listArray = res.iterateArray(numbers);
        System.out.println(listArray);
        int[] array = {-1,-33,-5,-17,-9,-13};
        int[] maxNum = res.findMaxNum(array);
        System.out.println(maxNum);
        double[] array = {1,3.7,5.2,7,8.4,21};
        double[] findAvg = res.findAverage(array);
        System.out.println(findAvg);
        ArrayList<Integer> allOdds = res.allOddInts();
        System.out.println(allOdds);
        int[] x = {1,3,5,7};
        int[] greaterCount = res.greaterThanY(x);
        System.out.println(greaterCount);
        int[] x = {1,2,4,6,7,9};
        int[] squareValues = res.squareVals(x);
        System.out.println(squareValues);
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(-1,-3,4,6,-2,7));
        ArrayList<Integer> removeNeg = res.negNumbers(numbers);
        System.out.println(removeNeg);
        ArrayList<Double> numbers = new ArrayList<Double>(Arrays.asList(-1.0,-3.0,4.0,6.0,-2.0,7.0));
        ArrayList<Double> findMaxMinAvg = res.maxMinAvg(numbers);
        System.out.println(findMaxMinAvg);
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> newArr = res.shiftLeft(numbers);
        System.out.println(newArr);
    }
}

