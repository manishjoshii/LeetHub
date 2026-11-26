class Solution:
    def canAliceWin(self, n: int) -> bool:
        flag: bool = False
        remove_count: int = 10

        while n >= remove_count:
            n -= remove_count
            remove_count -= 1
            flag = not flag

        return flag
