package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static int findlowestdiffference(int array[]) {
        int lowest;
        Arrays.sort(array);
        lowest = array[1] - array[0];
        return lowest;

    }
    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int smallestDifferenceArray1 = findlowestdiffference(array1);

        System.out.println("\n" + "The lowest difference between array1 cells is:" + " " + smallestDifferenceArray1);

        int smallestDifferenceArray2 = findlowestdiffference(array2);

        System.out.println("\n" + "The lowest difference between array2 cells is:" + " " + smallestDifferenceArray2);
        System.out.println("The lowest difference between array cells is" + " " + smallestDifferenceArray1);
    }


    }

