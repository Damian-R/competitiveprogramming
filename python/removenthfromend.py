# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        lag = None
        lead = head
        c = 0
        while lead.next:
            lead = lead.next
            c += 1
            if lag is not None:
                lag = lag.next
            if c == n:
                lag = head
        if c == 0:
            return None
        elif c + 1 == n:
            head = head.next
        elif lag and lag.next is not None:
            lag.next = lag.next.next
        return head

head = ListNode(1)
n = ListNode(2)
n.next = ListNode(3)
head.next = n
newhead = Solution().removeNthFromEnd(head, 2)

while newhead:
    print(newhead.val)
    newhead = newhead.next