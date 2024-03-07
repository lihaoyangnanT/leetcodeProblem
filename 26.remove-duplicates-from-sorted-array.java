/*
 * @lc app=leetcode.cn id=26 lang=java
 * @lcpr version=30118
 *
 * [26] 删除有序数组中的重复项
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    var removeDuplicates = function(nums) {
        var start = -1;
        var end = 0;
        var sum = 0
        if(nums.length == 1)
        {
            return nums
        }
        for(var k = 0;k<nums.length;k++)
        {
            if(nums[k] == nums[k+1])
            {
                sum++;
            }
        }
        if(sum == nums.length)
        {
            for(var s = 1;s<nums.length;s++)
            {
                nums[s] = -1
            }
            for(let j = 1;j<nums.length;j++)
            {
                if(nums[j] == -1)
                {
                    nums.splice(j,1)
                }
            }
            return nums;
        }
        for(var i = 0;i < nums.length;i++)
        {
            //1.先统计唯一出现的元素，剩下的即为重复的元素
            //2.从第一个元素开始，是重复元素就向后遍历到唯一元素，是唯一元素就向后走；
    
            //首先设立两个标记点，一个起始，一个结束，记录下标
            if(nums[i] == nums[i+1])
            {
                if(start == -1)
                {
                    start = i;
                }
                continue;
            }
            else
            {
                if(start == -1)
                {
                    continue;
                }
                else
                {
                    end = i;
                    for(var j = end;j>start;j--)
                    {
                        nums[j] = null;
                    }
                    start = -1;
                }
            }
        }
        for(let j = 0;j<nums.length;j++)
        {
            if(nums[j] == null)
            {
                nums.splice(j,1)
            }
        }
        for(let j = 0;j<nums.length;j++)
        {
            if(nums[j] == null)
            {
                nums.splice(j,1)
            }
        }
        for(let j = 0;j<nums.length;j++)
        {
            if(nums[j] == null)
            {
                nums.splice(j,1)
            }
        }
        for(let j = 0;j<nums.length;j++)
        {
            if(nums[j] == null)
            {
                nums.splice(j,1)
            }
        }
        for(let j = 0;j<nums.length;j++)
        {
            if(nums[j] == null)
            {
                nums.splice(j,1)
            }
        }
        for(let j = 0;j<nums.length;j++)
        {
            if(nums[j] == null)
            {
                nums.splice(j,1)
            }
        }
        for(let j = 0;j<nums.length;j++)
        {
            if(nums[j] == null)
            {
                nums.splice(j,1)
            }
        }
        for(let j = 0;j<nums.length;j++)
        {
            if(nums[j] == null)
            {
                nums.splice(j,1)
            }
        }
        return nums.length;
    };
// @lc code=end



/*
// @lcpr case=start
// [1,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [0,0,1,1,1,2,2,3,3,4]\n
// @lcpr case=end

 */

