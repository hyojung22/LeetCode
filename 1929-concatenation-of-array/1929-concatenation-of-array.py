class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        list = []
        for i in range(len(nums)):
            list.append(nums[i])
        return list*2
        