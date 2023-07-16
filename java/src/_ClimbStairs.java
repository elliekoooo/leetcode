import java.util.LinkedList;
import java.util.List;

public class _ClimbStairs {
    class Solution {
        public int climbStairs(int n) {
            if(n <= 2)
                return n;

            int front = 1;
            int back = 2;
            int count = 0;

            for(int i=2; i<n; i++){
                count = front + back;
                front = back;
                back = count;
            }

            return count;
        }
    }
}
