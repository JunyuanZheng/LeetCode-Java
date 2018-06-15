import java.util.ArrayDeque;

public class Question210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        boolean[][] matrix = new boolean[numCourses][numCourses];
        for (int[] prerequest : prerequisites) {
            int cur = prerequest[0];
            int pre = prerequest[1];
            if (!matrix[pre][cur]) {
                indegree[cur] += 1;
                matrix[pre][cur] = true;
            }
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i += 1) {
            if (indegree[i] == 0)
                queue.offer(i);
        }

        int[] result = new int[numCourses];
        int counter = 0;

        while (!queue.isEmpty()) {
            int pre = queue.poll();
            result[counter] = pre;
            counter += 1;
            for (int cur = 0; cur < numCourses; cur += 1) {
                if (matrix[pre][cur]) {
                    matrix[pre][cur] = false;
                    indegree[cur] -= 1;
                    if (indegree[cur] == 0)
                        queue.offer(cur);
                }
            }
        }

        return counter == numCourses ? result : new int[0];
    }
}
