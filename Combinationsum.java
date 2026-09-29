
    
import java.util.*;

class Combinationsum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates, int target, int start,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // Target reached
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try all possible choices
        for (int i = start; i < candidates.length; i++) {

            // If number is greater than remaining target, skip it
            if (candidates[i] > target) {
                continue;
            }

            // Choose
            current.add(candidates[i]);

            // Explore
            // i is used again because we can reuse the same number
            backtrack(candidates, target - candidates[i], i, current, result);

            // Undo choice
            current.remove(current.size() - 1);
        }
    }
}
