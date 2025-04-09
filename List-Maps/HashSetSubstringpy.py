class Solution:
    def uniqueSubstrings(self, s: str) -> set[str]:
        n = len(s)
        unique_substrings = set()

        for i in range(n):
            seen = set()
            curr_sub_str = ""
            for j in range(i, n):
                curr_char = s[j]
                if curr_char not in seen:
                    seen.add(curr_char)
                    curr_sub_str += curr_char
                    unique_substrings.add(curr_sub_str)
                else:
                    break
        return unique_substrings

    def lengthofsubstring(self, s: str) -> int:
        n = len(s)
        max_l = 0
        l = 0
        char_set = set()

        for r in range(n):
            curr_char = s[r]
            while curr_char in char_set:
                char_set.remove(s[l])
                l += 1
            char_set.add(curr_char)
            max_l = max(max_l, r - l + 1)
        return max_l

sol = Solution()
s = "abcsbdhbacbsjsaabcsabcsjroakdf"
length = sol.lengthofsubstring(s)
print(f"Longest substring is: {length}")

all_unique = sol.uniqueSubstrings(s)
print("Without repeating characters: ")
for sub in all_unique:
    print(sub)
print(f"Total Number of substrings: {len(all_unique)}")
























# Java iz Lub but jin chinzonko mai pyar krta hu vo muzhe taklip dete hai :)