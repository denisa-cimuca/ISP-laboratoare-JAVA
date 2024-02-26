package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] numbers = input.split(",");
        int[] result = {-1, -1, -1, -1}; // initialize result array with default values

        for (int i = 0; i < numbers.length; i++) {
            int nr = Integer.parseInt(numbers[i].trim());

            if (nr % 2 == 0) { // even number
                if (result[0] == -1 || nr > result[0]) {
                    result[0] = nr; // largest even number
                    result[1] = i; // position of largest even number
                }
            } else { // odd number
                if (result[2] == -1 || nr < result[2]) {
                    result[2] = nr; // smallest odd number
                    result[3] = i; // position of smallest odd number
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
