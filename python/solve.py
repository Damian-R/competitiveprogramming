import sys
from lib.ListNode import ListNode
import unittest

class Test(unittest.TestCase):
    def test_addTwoNumbers(self):
        from addtwonumbers import Solution
        from lib.var.addtwonumbers import l1
        from lib.var.addtwonumbers import l2
        res = Solution().addTwoNumbers(l1, l2)
        self.assertEqual(res.val, 8)
        self.assertEqual(res.next.val, 7)
    def test_lengthOfLongestSubstring(self):
        from lengthoflongestsubstring import Solution
        self.assertEqual(Solution().lengthOfLongestSubstring('abcabcbb'), 3)
    def test_longestCommonPrefix(self):
        from longestcommonprefix import Solution
        self.assertEqual(Solution().longestCommonPrefix(["flower","flow","flight"]), "fl")
    def test_longestPalindrome(self):
        from longestpalindrome import Solution
        self.assertEqual(Solution().longestPalindrome("babad"), "bab")
    def test_maxArea(self):
        from maxareawater import Solution
        self.assertEqual(Solution().maxArea([1,8,6,2,5,4,8,3,7]), 49)
    def test_mergeTwoLists(self):
        from mergetwolists import Solution
        from lib.var.mergetwolists import l1
        from lib.var.mergetwolists import l4
        from lib.var.mergetwolists import res
        ans = Solution().mergeTwoLists(l1, l4)
        # idk how to make this better lolololol
        self.assertEqual(ans.val, res.val)
        self.assertEqual(ans.next.val, res.next.val)
        self.assertEqual(ans.next.next.val, res.next.next.val)
        self.assertEqual(ans.next.next.next.val, res.next.next.next.val)
        self.assertEqual(ans.next.next.next.next.val, res.next.next.next.next.val)
        self.assertEqual(ans.next.next.next.next.next.val, res.next.next.next.next.next.val)
    def test_removeNthFromEnd(self):
        from removenthfromend import Solution
        from lib.var.removenthfromend import head
        from lib.var.removenthfromend import res
        ans = Solution().removeNthFromEnd(head, 2)
        self.assertEqual(ans.val, res.val)
        self.assertEqual(ans.next.val, res.next.val)

unittest.main()