package io.piggydance.kts.tools

import java.util.LinkedList
import java.util.Queue
import io.piggydance.kts.api.TreeNode

object BinaryTree {
    fun from(root: Array<Int?>): TreeNode? {
        if (root.isEmpty() || root[0] == null) {
            return null
        }

        val rootNode = TreeNode(root[0]!!)
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(rootNode)

        var i = 1
        while (queue.isNotEmpty() && i < root.size) {
            val currentNode = queue.poll()

            root[i]?.let {
                val leftNode = TreeNode(it)
                currentNode.left = leftNode
                queue.add(leftNode)
            }
            i++

            if (i < root.size) {
                root[i]?.let {
                    val rightNode = TreeNode(it)
                    currentNode.right = rightNode
                    queue.add(rightNode)
                }
            }
            i++
        }

        return rootNode
    }
}
