import java.util.ArrayList;
import java.util.Iterator;

public class zeroMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 1, 1, 1},
      {1, 0, 1, 1},
      {1, 1, 1, 1},
      {0, 1, 1, 1}
    };
    zeroMatrix(matrix);
  }

  public static boolean zeroMatrix(int[][] matrix) {
    ArrayList<Integer[]> coords = new ArrayList<Integer[]>();
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        Integer[] tuple = {i, j};
        if (matrix[i][j] == 0) coords.add(tuple);
      }
    }

    Iterator<Integer[]> iterator = coords.iterator();

    iterator.forEachRemaining(coord -> {
      zeroRow(coord[0], matrix);
      zeroCol(coord[1], matrix);
    });
    return true;
  }

  public static void zeroRow(int row, int[][] matrix) {
    for (int i = 0; i < matrix[0].length; i++) {
      matrix[row][i] = 0;
    }
  }

  public static void zeroCol(int col, int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][col] = 0;
    }
  }

}
