package org.pg4200.ex01;

public class ArrayUtilsImp implements ArrayUtils {
    @Override
    public int min(int[] array) throws IllegalArgumentException {
        checkArray(array);

        int min = array[0];

        for(int element : array){
            if(min > element){
                min = element;
            }
        }
        return min;
    }

    @Override
    public int max(int[] array) throws IllegalArgumentException {
        checkArray(array);

        int max = array[0];

        for(int element : array) {
            if(max < element){
                max = element;
            }
        }
        return max;
    }

    @Override
    public double mean(int[] array) throws IllegalArgumentException {
        checkArray(array);

        double mean = 0;

        for(int i = 0; i < array.length; i++) {
            mean += array[i];
        }

        return mean / array.length;
    }

    private void checkArray(int[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Invalid empty array as input");
        }
    }
}
