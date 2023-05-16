package view;
import java.util.*;

public class IDAStar {

    // Hàm tính h(n), hàm heuristic
    private static int heuristic(int[] state, int[] goal) {
        // Tính khoảng cách Manhattan giữa trạng thái hiện tại và trạng thái mục tiêu
        int h = 0;
        for (int i = 0; i < state.length; i++) {
            if (state[i] != goal[i]) {
                h++;
            }
        }
        return h;
    }

    // Hàm tìm kiếm IDA*
    public static int[] idaStarSearch(int[] state, int[] goal, List<int[]> actions, int[][] cost) {
        // Hàm đệ quy tìm kiếm
        int bound = heuristic(state, goal);
        int[] result = new int[state.length];
        while (true) {
            int t = search(state, 0, bound, actions, cost, goal, result);
            if (t == -1) {
                return null; // Không tìm thấy giải pháp
            }
            if (t == Integer.MAX_VALUE) {
                return result; // Tìm thấy giải pháp
            }
            bound = t;
        }
    }

    private static int search(int[] state, int g, int bound, List<int[]> actions, int[][] cost, int[] goal, int[] result) {
        int f = g + heuristic(state, goal);
        if (f > bound) {
            return f;
        }
        if (Arrays.equals(state, goal)) {
            return Integer.MAX_VALUE;
        }
        int minCost = Integer.MAX_VALUE;
        for (int[] action : actions) {
            int[] nextState = applyAction(state, action);
            int nextCost = g + cost[action[0]][action[1]];
            result[nextCost] = action[0]; // Lưu hành động vào kết quả
            int t = search(nextState, nextCost, bound, actions, cost, goal, result);
            if (t == Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (t < minCost) {
                minCost = t;
            }
        }
        return minCost;
    }

    private static int[] applyAction(int[] state, int[] action) {
        int[] newState = state.clone();
        int temp = newState[action[0]];
        newState[action[0]] = newState[action[1]];
        newState[action[1]] = temp;
        return newState;
    }

    public static void main(String[] args) {
        int[] state = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] goal = {4, 3, 2, 1, 5, 6, 7, 8};
        List<int[]> actions = new ArrayList<>();
        actions.add(new int[]{0, 1});
        actions.add(new int[]{1, 2});
        actions.add(new int[]{3, 4});
        actions.add(new int[]{4, 5});
        actions.add(new int[]{6, 7});
        actions.add(new int[]{7, 8});
        int[][] cost = {
                {1, 1, 1, 1,1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };
        int[] result = idaStarSearch(state, goal, actions, cost);
        if (result == null) {
            System.out.println("Không tìm thấy giải pháp");
        } else {
            System.out.println("Giải pháp:");
            for (int i = 0; i < result.length; i++) {
                if (result[i] != 0) {
                    int[] action = actions.get(result[i]);
                    System.out.println("Swap " + action[0] + " và " + action[1]);
                }
            }
        }
    }
}
