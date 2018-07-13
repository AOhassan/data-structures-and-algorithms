package day05;

public class TransposeMatrix {
    public static int[][] transposeMatrix(int[][] aa) {
        int row = aa.length;
        int col = aa[0].length;
        int[][] answer = new int[row][col];

        for (row = 0; row < aa.length; row++) {
            for (col = 0; col < aa[row].length; col++) {
                answer[row][col] = aa[col][row];
            }
        }
        return answer;

    }
}
