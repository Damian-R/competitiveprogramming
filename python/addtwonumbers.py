from lib.ListNode import ListNode

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