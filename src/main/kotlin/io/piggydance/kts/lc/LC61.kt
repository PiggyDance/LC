package io.piggydance.kts.lc

import io.piggydance.kts.api.ListNode

/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 *
 * 链表中节点的数目在范围 [0, 500] 内
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 109
 *
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 *
 * 输入：head = [0,1,2], k = 4
 * 输出：[2,0,1]
 */
class LC61 {
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        var curNode = head
        var length = 1
        while (curNode?.next != null) {
            length++
            curNode = curNode.next
        }
        // 循环到最后
        if (length == 0) {
            return head
        }
        val rotate = k % length
        if (rotate == 0) {
            return head
        }
        curNode?.next = head
        var sub = length - rotate
        while (sub-- > 0) {
            curNode = curNode?.next
        }
        val result = curNode?.next
        curNode?.next = null
        return result
    }
}
