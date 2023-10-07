package Interviewquestions.basics;

public class LargestNumberInArrayNew {

    public static int findLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
         int[] arr = {1, 3, 4, 6, 17};

        System.out.println(findLargestElement(arr));
    }
}



