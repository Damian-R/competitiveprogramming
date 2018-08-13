# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        x, l1sum, l2sum = 0, 0, 0
        while l1 or l2:
            if l1:
                l1sum += l1.val * (10**x)
                l1 = l1.next
            if l2:
                l2sum += l2.val * (10**x)
                l2 = l2.next
            x += 1
        total = l1sum + l2sum
        head = ListNode(0)
        travel = head
        length = len(str(total))
        for i in range(length):
            travel.val = total % 10
            if i < length - 1:
                temp = ListNode(0)
                travel.next = temp
                travel = travel.next
            total = total // 10
        return head

        
        

sol = Solution()

l1 = ListNode(2)
l2 = ListNode(4)
l3 = ListNode(3)
l1.next = l2
l2.next = l3

l4 = ListNode(5)
l5 = ListNode(6)
l6 = ListNode(4)
l4.next = l5
l5.next = l6
# l1 = ListNode(5)
# l4 = ListNode(5)

res = sol.addTwoNumbers(l1, l4)

while res:
    print (res.val)
    res = res.next