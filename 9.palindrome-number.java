/*
 * @lc app=leetcode.cn id=9 lang=java
 * @lcpr version=30118
 *
 * [9] 回文数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
         int revert = 0;
         if(x == 0)
         {
             return true;
         }
         if(x<0||x%10==0)
         {
            return false;
         }
         while(x>revert)
         {
            revert = revert*10+x%10;
            x = x/10;
         }
         return x==revert||x == revert/10;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 121\n
// @lcpr case=end

// @lcpr case=start
// -121\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

 */

