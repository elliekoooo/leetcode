import java.util.*;
import java.util.stream.Collectors;

public class _3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for(int first = 0; first < nums.length; first++){
            int start = first+1;
            int end = nums.length-1;

            Arrays.sort(nums);
            while(start < end){
                int sum = nums[first] + nums[start] + nums[end];
                if(sum == 0) {
                    set.add(Arrays.asList(nums[first], nums[start], nums[end]));
                    start++;
                    end--;
                }else if(sum < 0)
                    start++;
                else {
                    end--;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
