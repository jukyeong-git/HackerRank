package Result;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class MinimumMoves {
    /*
     *  https://www.hackerrank.com/challenges/castle-on-the-grid/problem
     *  Castle on the Grid
     */
    public static int minimumMoves(List<String> grid, int startX, int startY, int goalX, int goalY) {

        int n = grid.size();
        int[][] dist = new int[n][n];
        for(int[] row : dist) Arrays.fill(row, -1);

        Deque<int[]> q = new ArrayDeque<>();
        dist[startX][startY] = 0;
        q.offer(new int[]{startX, startY});

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];

            if(r == goalX && c == goalY) return dist[r][c];

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d], nc = c + dc[d];
                while (0 <= nr && nr < n && 0 <= nc && nc < n
                        && grid.get(nr).charAt(nc) != 'X') {
                    if (dist[nr][nc] == -1) {               // 처음 도달했을 때만 기록
                        dist[nr][nc] = dist[r][c] + 1;
                        q.offer(new int[]{nr, nc});
                    }
                    // 같은 이동 내에서 계속 직선으로 전진
                    nr += dr[d];
                    nc += dc[d];
                }
            }
        }
        return -1;
    }
}
