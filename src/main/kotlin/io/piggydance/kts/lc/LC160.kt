package io.piggydance.kts.lc

import io.piggydance.kts.api.ListNode

class LC160 {

    /**
     * link: https://leetcode.cn/problems/intersection-of-two-linked-lists
     *
     * 分析: 这是一个经典问题
     * 解决思路: 双指针同时遍历,当第一次任何一个指针为null的时候,将指针设置为另外一个链表头继续遍历一遍.
     *      当指针"相等"时,循环结束.
     * 指针相等有两种情况:
     *  1. 真的相等了
     *  2. 都为null
     * 而第二遍的时候,由于双指针交换了一下链表,所以最终这次遍历到最后的时候,一定存在pa==pb==null的情况.
     * 所以在这里停止遍历,作为终结条件.
     */
    fun getIntersectionNode_Iteration(headA:ListNode?, headB: ListNode?):ListNode? {
        var pa = headA
        var pb = headB

        while (pa != pb) {
            pa = if (pa?.next == null) {
                headB
            } else {
                pa.next
            }

            pb = if (pb?.next == null) {
                headA
            } else {
                pb.next
            }
        }

        return pa
    }

    /**
     * 第一种方法需要思考,反应一下,虽然可以证明是正确的,但是并不"直观".
     * 第二种方法则是非常直观且正确的,将链表A中的所有元素放入Set中,遍历B,查找B中的元素是否已经出现在A中了.
     * 为了在面试中表现稳妥,这种方法应该是首选.
     */
    fun getIntersectionNode_HashSet(headA:ListNode?, headB: ListNode?):ListNode? {
        if (headB == null || headA == null) {
            return null
        }

        val set = mutableSetOf<ListNode>()
        var pa = headA
        while (pa != null) {
            set.add(pa)
            pa = pa.next
        }

        var pb = headB
        while (pb != null) {
            if (set.contains(pb)) {
                return pb
            }
            pb = pb.next
        }

        return null
    }

}
