class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        num = 0
        for i in range (len(accounts)):
            if num < sum(accounts[i]):
                num = sum(accounts[i])
        return num
