from lib.ListNode import ListNode

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

res = ListNode(1)
res.next = ListNode(1)
res.next.next = ListNode(2)
res.next.next.next = ListNode(3)
res.next.next.next.next = ListNode(4)
res.next.next.next.next.next = ListNode(4)