/*
 * @lc app=leetcode.cn id=20 lang=java
 * @lcpr version=30118
 *
 * [20] 有效的括号
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.Stack;
class Solution {
    public boolean isValid(String s){
    Stack<Character> stack = new Stack<>();
    boolean flag = false;
    if(s.length()%2 == 1)
    {
        return false;
    }
    for(int i=0;i<s.length();i++)
    {
        char c = s.toCharArray()[i];
        if(stack.isEmpty() && (c ==')' || c==']' || c=='}'))
        {
            return false;
        }
        if(c=='(' || c=='[' || c=='{')
        {
            stack.push(c);
        }
        else
        {
            Character d = stack.pop();
        if(c == ' '&& (d == '('||d == '['||d == '{'))
        {
            return false;
        }
        if(c==')'&&d=='(')
        {
            flag = true;
            continue;
        }
        if(c==']'&&d=='[')
        {
            flag = true;
            continue;
        }
        if(c=='}'&&d=='{')
        {
            flag = true;
            continue;
        }
        else
        {
            return false;
        }
        }
    }
    return flag && stack.isEmpty();
    }
}    
// @lc code=end

/*
 * // @lcpr case=start
 * // "()"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "()[]{}"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "(]"\n
 * // @lcpr case=end
 * 
 */
