import java.util.Arrays;

/**
 * Write a method that takes an array of integers and returns an array of products,
 * where each product[i] is the product of all integers[j] where j != i.
 *
 *  For example, given: [1, 7, 3, 4]
 *
 *  your method would return: [84, 12, 28, 21]
 *
 *  by calculating: [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
 */
class ProductOfOthers {
//--------------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Constructor---------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Private Methods-----------------------------------------------------------------------------------------------------//
    /**
     * Error helper method.
     */
    private static void errorArrayToShort() {

        System.out.printf("\n%s\n", "The array's length is too short.");
    }

    /**
     * Print helper method.
     *
     * @param productOfOthersArray this array will be printed to the user.
     */
    private static void print(int[] productOfOthersArray) {

        System.out.printf("\n%s\n", Arrays.toString(productOfOthersArray));
    }
//--------------------------------------------------------------------------------------------------------------------//

//Package Private Methods---------------------------------------------------------------------------------------------//
    /**
     * The trick is brute force - Nested for loops.
     *
     * @param arr the array that will be used to find the product of others.
     */
    static void getProductOfOthers_Ver0(int[] arr) {

        if (arr.length < 2) { errorArrayToShort(); return; }

        int[] productArray = new int[arr.length];

        for (int i = 0; i <productArray.length; i++) {

            productArray[i] = 1;
            for (int j = 0; j < arr.length; j++) {

                if (i != j) { productArray[i] *= arr[j]; }
            }
        }
        print(productArray);
    }

    /**
     * The trick is to store two product arrays - One cumulative product to left and
     * another cumulative product to right.
     *
     * @param arr the array that will be used to find the product of others.
     */
    static void getProductOfOthers_Ver1(int[] arr) {

        if (arr.length < 2) { errorArrayToShort(); return; }

        int[] productArray = new int[arr.length];

        int left = 1;
        int right = 1;

        // Left to Right:
        for (int i = 0; i < arr.length; i++) {

            productArray[i] = left;
            left *= arr[i];
        }

        // Right to Left:
        for(int i = arr.length-1; i >= 0; i--) {

            productArray[i] *= right;
            right *= arr[i];
        }
        print(productArray);
    }

    /**
     * The trick is division - Find the product of all the integers in the array,
     * Then for each integer at each location divided from the total product.
     *
     * @param arr the array that will be used to find the product of others.
     */
    static void getProductOfOthers_Ver2(int[] arr) {

        if (arr.length < 2) { errorArrayToShort(); return; }

        int tempProduct = 1;

        for (int anArr : arr) { tempProduct *= anArr; }

        for (int i = 0; i < arr.length; i++) { arr[i] = tempProduct / arr[i]; }

        print(arr);
    }
//--------------------------------------------------------------------------------------------------------------------//

//Public Methods------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Setters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Getters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

}//End of Class.
