package example.nio;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largestPos = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largestPos]){
                    largestPos = i;
                }
            }
            
            swap(intArray, largestPos, lastUnsortedIndex);
        }

        for(int number: intArray){
            System.out.println(number);
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

