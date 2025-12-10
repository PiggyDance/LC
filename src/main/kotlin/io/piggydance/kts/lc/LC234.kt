package io.piggydance.kts.lc

import io.piggydance.kts.api.ListNode

class LC234 {
    private var front: ListNode? = null

    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }

        front = head
        return check(head)
    }

    private fun check(head: ListNode?): Boolean {
        if (head != null) {
            if (!check(head.next)) {
                return false
            }
            if (front!!.`val` != head.`val`) {
                return false
            }
            front = front!!.next
        }
        return true
    }
}
