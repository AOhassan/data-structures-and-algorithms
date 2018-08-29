package day37;

public class main {
    public static void main(String[] args) {
        double[] randomThou = Sort.randomArray(10000);
        double[] randomHunnidThou = Sort.randomArray(100000);
        double[] randominfinite = Sort.randomArray(1000000);


        long start1 = System.currentTimeMillis();
        double[] arr1 = Sort.insertionSort(randomThou);
        long delta1 = System.currentTimeMillis() - start1;
        System.out.println("Insertion sort of an array size 10,000 took: " + delta1 +"ms");
        boolean sorted = Sort.isSorted(arr1);
        System.out.println("Is it Sorted: " + sorted );
        System.out.println();

        long start2 = System.currentTimeMillis();
        double[] arr2 = Sort.mergeSort(randomThou);
        long delta2 = System.currentTimeMillis() - start2;
        System.out.println("Merge sort of an array size 10,000 took: " + delta2 +"ms");
        boolean sorted1 = Sort.isSorted(arr2);
        System.out.println("Is it Sorted: " + sorted1 );
        System.out.println();
        System.out.println();



        long start3 = System.currentTimeMillis();
        double[] arr3 = Sort.insertionSort(randomHunnidThou);
        long delta3 = System.currentTimeMillis() - start3;
        System.out.println("Insertion sort of an array size 100,000 took: " + delta3 +"ms");
        boolean sorted3 = Sort.isSorted(arr3);
        System.out.println("Is it Sorted: " + sorted3 );
        System.out.println();

        long start4 = System.currentTimeMillis();
        Sort.mergeSort(randomHunnidThou);
        long delta4 = System.currentTimeMillis() - start4;
        System.out.println("Merge sort of an array size 100,000 took: " + delta4 +"ms");
        boolean sorted4 = Sort.isSorted(arr1);
        System.out.println("Is it Sorted: " + sorted4 );
        System.out.println();
        System.out.println();



        long start5 = System.currentTimeMillis();
        Sort.insertionSort(randominfinite);
        long delta5 = System.currentTimeMillis() - start5;
        System.out.println("Insertion sort of an array size 1,000,000 took: " + delta5 +"ms");
        boolean sorted5 = Sort.isSorted(randominfinite);
        System.out.println("Is it Sorted: " + sorted5 );
        System.out.println();

        long start6 = System.currentTimeMillis();
        double[] arr6 = Sort.mergeSort(randominfinite);
        long delta6 = System.currentTimeMillis() - start6;
        System.out.println("Merge sort of an array size 1,000,000 took: " + delta6 +"ms");
        boolean sorted6 = Sort.isSorted(arr6);
        System.out.println("Is it Sorted: " + sorted6 );
        System.out.println();
        System.out.println();

    }
}
