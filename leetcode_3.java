import java.util.*;


// solution类
public class leetcode_3 {
    // solution函数
    public int lengthOfLongestSubstring(String s) {
        // 创建HashMap用来存储最后一个字符的位置
        HashMap<Character, Integer> map = new HashMap<>();
        // 最长字符串的开头和结尾处
        int start = 0, end = 0;
        // 结果
        int ans = 0;
        // 获取输入的字符串的长度
        int n = s.length();
        for (; end < n; end++) {
            // 获取当前末尾字符
            char ch = s.charAt(end);
            // 字符出现重复
            if (map.containsKey(ch)) {
                // 更新开始位置
                start = map.get(ch);
            }
            // 更新最长字符串的长度
            ans = Math.max(ans, end - start + 1);
            // 更新字符位置，end+1作为下一轮的start确保下一串字符串不会出现重复
            map.put(ch, end + 1);
        }

        return ans;
    }
}
