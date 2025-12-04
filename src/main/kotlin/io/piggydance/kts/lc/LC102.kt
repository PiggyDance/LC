package io.piggydance.kts.lc

import io.piggydance.kts.api.TreeNode
import java.util.*

class LC102 {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val q: Queue<TreeNode> = LinkedList<TreeNode>()
        q.offer(root)
        val result = mutableListOf<List<Int>>()
        while (q.isNotEmpty()) {
            val l = mutableListOf<Int>()
            val levelSize = q.size

            for (i in 0 until levelSize) {
                val h = q.poll()
                if (h.left != null) {
                    q.offer(h.left)
                }
                if (h.right != null) {
                    q.offer(h.right)
                }
                l.add(h.`val`)
            }
            result.add(l)
        }
        return result
    }
}