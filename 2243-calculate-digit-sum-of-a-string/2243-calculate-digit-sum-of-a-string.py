class Solution:
    def digitSum(self, s: str, k: int) -> str:

        while len(s) > k:
            sum: int = 0
            next: str = ""

            for i in range(len(s)):
                sum += int(s[i])

                if (i + 1) % k == 0 or (i + 1) == len(s):
                    next += str(sum)
                    sum = 0

            s = next

        return s
