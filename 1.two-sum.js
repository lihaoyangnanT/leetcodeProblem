/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for(var i = 0;i<nums.length;i++)
    {
        for(var j = i+1;j<nums.length;j++)
        {
            if(nums[i]+nums[j] == target && i!=j)
            {
                // console.log("["+i+','+j+']')
                return [i,j]
                // i = j
            }
        }
       
    }
};
// @lc code=end



/*
// @lcpr case=start
// [2,7,11,15]\n9\n
// @lcpr case=end

// @lcpr case=start
// [3,2,4]\n6\n
// @lcpr case=end

// @lcpr case=start
// [3,3]\n6\n
// @lcpr case=end

 */

