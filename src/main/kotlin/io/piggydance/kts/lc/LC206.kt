package io.piggydance.kts.lc

import io.piggydance.kts.api.ListNode

class LC206 {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        var pre: ListNode? = null
        var cur = head

        while (cur != null) {
            val next = cur.next
            cur.next = pre
            pre = cur
            cur = next
        }

        return pre
    }
}
