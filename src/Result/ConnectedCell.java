package Result;

import java.util.List;

public class ConnectedCell {
    /*
     *  https://www.hackerrank.com/challenges/connected-cell-in-a-grid/problem
     *  Connected Cells in a Grid
     */
    public static int connectedCell(List<List<Integer>> matrix) {
        // Write your code here
        if(matrix.isEmpty()) return 0;

        int m = matrix.size();
        int n = matrix.get(0).size();
        int count = 0;

        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix.get(i).get(j) == 1 && !visited[i][j]) {
                    count = Math.max(count, dfs(matrix, i, j, visited));
                }
            }
        }

        return count;
    }

    public static int dfs(List<List<Integer>> matrix, int i, int j, boolean[][] visited) {
        visited[i][j] = true;

        int count = 1;
        int m = matrix.size();
        int n = matrix.get(0).size();

        for(int o = i - 1; o <= i + 1; o++) {
            for(int p = j - 1; p <= j + 1; p++) {
                if(o == i && p == j) continue;;
                if(0 <= o && o < m && 0 <= p && p < n && !visited[o][p] && matrix.get(o).get(p) == 1) {
                    count += dfs(matrix, o, p, visited);
                }
            }
        }

        return count;
    }
}
