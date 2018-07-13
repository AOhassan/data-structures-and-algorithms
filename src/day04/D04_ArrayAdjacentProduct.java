package day04;


public class D04_ArrayAdjacentProduct {

    private static int cellValue(int[][] aa, int row, int col) {

        if (row < 0 || row >= aa.length || col < 0 || col >= aa[row].length) {
            return 0;
        }

        return aa[row][col];
    }


    private static int checkNeighbors(int[][] aa, int row, int col) {
        int max = 0;
        int cell = aa[row][col];

        max = Math.max(max, cell * cellValue(aa, row + 1, col));
        max = Math.max(max, cell * cellValue(aa, row + 1, col - 1));
        max = Math.max(max, cell * cellValue(aa, row + 1, col + 1));
        max = Math.max(max, cell * cellValue(aa, row, col + 1));

        return max;
    }

    public static int largestProduct(int[][] aa){
        int max = 0;
        for (int row = 0; row < aa.length; row++) {
            for (int col = 0; col < aa[row].length; col++) {
                int product = checkNeighbors(aa, row, col);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }




}


