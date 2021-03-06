import static java.lang.System.*;

/**
 * Fibonacci numbers
 Each new term in the Fibonacci sequence is
 generated by adding the previous two terms.
 By starting with 1 and 2, the first 10 terms will be:
 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 By considering the terms in the Fibonacci
 sequence whose values do not exceed four million,
 find the sum of the even-valued terms.
 */

public  class fibonachi {
    //constructor is a private - to avoid of creating the instances
    private fibonachi(){};
    //consts
    static final String INVALID_ARGUMENT = "INVALID_ARGUMENT";
    static final long MAX_FIB = 4000000;

    /** @return the number of Fibonachi sequence by it index if
     index greater or equls zero
    @throws java.lang.IllegalArgumentException if index less than zero*/
    private static long getFibonachi(int i) throws IllegalArgumentException {
        if (i < 0)
            throw new  IllegalArgumentException(INVALID_ARGUMENT);
        if (i == 0 || i == 1) return i;

        long n = getFibonachi(i - 1) + getFibonachi(i - 2);
        return n;

    }
    /** @return the sum of even terms Fibonachi sequance, captured by limit
     the calcuting based on Fibonachi pattern that after two odds number      followed by the even number*/


    public static long getFibonachiEvenSum(long limit) {
        long sum = 0;
        int index = 0;
        long current=0;
        do {
                current=getFibonachi(index);
                sum += current;
                index += 3;
        } while (current < limit);


        return sum;
    }

    // the main function
    public static void main(String[] args) {

        System.out.println(getFibonachiEvenSum(MAX_FIB));


    }
}