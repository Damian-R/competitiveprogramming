# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
    def print(self):
        travel = self
        while travel:
            print(travel.val, end=' ')
            travel = travel.next

class Solution:
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if not l1 and not l2:
            return None
        head = ListNode(0)
        travel = head
        while l1 or l2:
            if not l1:
                travel.val = l2.val
                l2 = l2.next
            elif not l2:
                travel.val = l1.val
                l1 = l1.next
            elif l1.val < l2.val:
                travel.val = l1.val
                l1 = l1.next
            else:
                travel.val = l2.val
                l2 = l2.next
            if l1 or l2:
                travel.next = ListNode(0)
                travel = travel.next
        return head

l1 = ListNode(1)
l2 = ListNode(2)
l3 = ListNode(4)

l1.next = l2
l2.next = l3

l4 = ListNode(1)
l5 = ListNode(3)
l6 = ListNode(4)

l4.next = l5
l5.next = l6

Solution().mergeTwoLists(l1, l4).print()