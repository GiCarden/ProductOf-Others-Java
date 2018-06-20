
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
public class Main {

    public static void main(String args[]) {

        int[] array = {1, 7, 3, 4};

        ProductOfOthers.getProductOfOthers_Ver0(array);
        ProductOfOthers.getProductOfOthers_Ver1(array);
        ProductOfOthers.getProductOfOthers_Ver2(array);
    }
}
