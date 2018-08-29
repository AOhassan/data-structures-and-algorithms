package day37;

public class main {
    public static void main(String[] args) {
        double[] randomThou = Sort.randomArray(10000);
        double[] randomHunnidThou = Sort.randomArray(100000);
        double[] randominfinite = Sort.randomArray(1);

        System.currentTimeMillis();



        long start1 = System.currentTimeMillis();

        double[] arr1 = Sort.insertionSort(randomThou);

        long delta1 = System.currentTimeMillis() - start1;

        System.out.println("Insertion sort of an array size 10,000 took: " + delta1 +"ms");
        boolean sorted = Sort.isSorted(arr1);
        System.out.println("Is it Sorted: " );


        long start2 = System.currentTimeMillis();

        Sort.mergeSort(randomThou);

        long delta2 = System.currentTimeMillis() - start2;

        System.out.println("Merge sort of an array size 100,000 took: " + delta2 +"ms");




        long start3 = System.currentTimeMillis();

        Sort.insertionSort(randomHunnidThou);

        long delta3 = System.currentTimeMillis() - start1;

        System.out.println("Insertion sort of an array size 100,000 took: " + delta1 +"ms");


        long start4 = System.currentTimeMillis();

        Sort.mergeSort(randomThou);

        long delta4 = System.currentTimeMillis() - start2;

        System.out.println("Merge sort of an array size 10,000 took: " + delta2 +"ms");

    }
}
