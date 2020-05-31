package task_1;


public class Program {
    public static void main(String args[]){
        int array[] = new int[]{10, 11, 88, 2, 12, 120};

        int max = getMax(array);
        System.out.println("Maximum: " + max);

        int min = getMin(array);
        System.out.println("Minimum: " + min);

        int sum = 0;
        for (int x: array) {
            sum += x;
        }

        System.out.println("Average: " + sum / array.length);
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++) {
            if(inputArray[i] > maxValue) {
            maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++) {
            if(inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    public static int findSumWithoutUsingStream(int[] inputArray) {
        int sum = 0;
        for (int value : inputArray) {
            sum += value;
        }
        return sum;
    }
    public static double findAverageWithoutUsingStream(int[] inputArray) {
        int sum = findSumWithoutUsingStream(inputArray);
        return (double) sum / inputArray.length;
    }

}
