package io.piggydance.kts.learn

import io.piggydance.kts.tools.BinaryTree
import io.piggydance.kts.api.TreeNode

class SolutionPreorder {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        traversal(root, result)
        return result
    }

    private fun traversal(root: TreeNode?, result: MutableList<Int>) {
        if (root == null) {
            return
        }
        result.add(root.`val`)
        traversal(root.left, result)
        traversal(root.right, result)
    }
}

fun main() {
    val node = BinaryTree.from(arrayOf(1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9))
    val solution = SolutionPreorder()
    println(solution.preorderTraversal(node))
}
