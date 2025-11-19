package io.piggydance.kts.learn

import io.piggydance.kts.tools.BinaryTree
import io.piggydance.kts.api.TreeNode


class SolutionInorderTraversal {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        traversal(root, result)
        return result
    }

    private fun traversal(root: TreeNode?, result: MutableList<Int>) {
        if (root == null) {
            return
        }
        traversal(root.left, result)
        result.add(root.`val`)
        traversal(root.right, result)
    }
}

fun main() {
    val node = BinaryTree.from(arrayOf(1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9))
    val solution = SolutionInorderTraversal()
    println(solution.inorderTraversal(node))
}
