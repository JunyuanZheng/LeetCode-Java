public class Question200 {
    public int numIslands(char[][] grid) {
        int counter = 0;
        for (int r = 0; r < grid.length; r += 1) {
            for (int c = 0; c < grid[r].length; c += 1) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    counter += 1;
                }
            }
        }
        return counter;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || grid[r][c] != '1')
            return;
        grid[r][c] = 'X';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}
