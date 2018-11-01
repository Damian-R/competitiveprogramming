from lib.ListNode import ListNode

head = ListNode(1)
n = ListNode(2)
n.next = ListNode(3)
head.next = n

res = ListNode(1)
res.next = ListNode(3)