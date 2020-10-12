package Tasks;
import java.util.*;
import java.util.stream.Collectors;

public class TestAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        int first = i;
        int second = j;
        if(i > j) {
            first = j;
            second = i;
        }

        for(int k = 0; k < n; k++) {
            for(int l = 0; l < m; l++) {
                if(l == first) {
                    System.out.print(matrix[k][second] + " ");
                } else {
                    if(l == second) {
                        System.out.print(matrix[k][first] + " ");
                    } else {
                        System.out.print(matrix[k][l] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
