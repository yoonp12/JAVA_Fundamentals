import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class BasicJava {
    public Integer print1To255(){
        Integer myArray = new Integer(255);
        int i = 1;
        while(i <= 255){
            System.out.println(i);
            i++;
        }
        return(myArray);
    }
    public Integer printOddNums1To255(){
        Integer myArray1 = new Integer(255);
        int i = 1;
        while (i <= 255){
            if(i%2 == 1){
                System.out.println(i);    
            }
            i++;
        }
        return(myArray1);
    }
    public Object printSumOfArray(){
        Object myArray2 = new Object();
        int i = 0;
        int sum = 0;
        while(i <= 255) {
            System.out.println("New number: " + i);
            sum += i;
            System.out.println("Sum: " + sum);
            i++;
        }
        return myArray2;
    }
    public int[] iterateArray(int[]numbers){
        for(int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
        return numbers;
    }
    public int[] findMaxNum(int[]numbers){  
        int max = numbers[0];
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i]>= max){
                max = numbers[i];
            }
        }
        System.out.println(max);
        return numbers;
    }
    public double[] findAverage(double[]numbers){
        double sum = 0.0;
        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        double avg = sum/numbers.length;
        System.out.format("%.2f", avg);
        return numbers;
    }
    public ArrayList<Integer> allOddInts(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        int i = 1;
        while(i <= 255){
            if(i%2 == 1){
                y.add(i);
            }
            i++;
        }
        return y;
    }
    public int[] greaterThanY(int[]numbers){
        int y = 4;
        int count = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]> y){
                count ++;
            }
        }
        System.out.println(count);
        return numbers;
    }
    public int[] squareVals(int[]numbers){
        int[] newArr = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            int z = numbers[i];
            int y = (int)Math.pow(z,2);
            newArr[i] = y;
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
    public ArrayList<Integer> negNumbers(ArrayList<Integer>numbers){
        for(int i = 0; i < numbers.size(); i++){
            int num = numbers.get(i);
            if(num < 0){
                numbers.remove(i);
                i = i-1;
            }
        }
        return numbers;
    }
    public ArrayList<Double> maxMinAvg(ArrayList<Double>numbers){
        ArrayList<Double> newArr = new ArrayList<Double>();
        double max = numbers.get(0);
        double min = numbers.get(0);
        double total = 0.0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) >= max){
                max = numbers.get(i);
            }
            if(numbers.get(i) <= min){
                min = numbers.get(i);
            }
            total += numbers.get(i);
        }
        newArr.add(max);
        newArr.add(min);
        newArr.add(total/numbers.size());
        return newArr;
    }
    public ArrayList<Integer> shiftLeft(ArrayList<Integer>numbers){
        numbers.remove(0);
        numbers.add(0);
        return numbers;
    }
}