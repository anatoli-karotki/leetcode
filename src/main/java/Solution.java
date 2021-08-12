import binary_tree.TreeNode;

import java.util.*;


class Solution {
    public int addRungs(int[] rungs, int dist) {
        int count = 0;
        int cur = 0;
        for (int next : rungs) {
            int delta = next - cur;
            if (delta > dist) {
                if (delta % dist == 0) count += delta / dist - 1;
                else count += delta / dist;
            }
            cur = next;
        }
        return count;
    }
}