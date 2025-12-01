package io.piggydance.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC376JavaTest {
    @Test
    void test() {
        LC376Java solution = new LC376Java();
        assertEquals(1, solution.wiggleMaxLength(new int[] {1}));
        assertEquals(2, solution.wiggleMaxLength(new int[] {1, 3}));
        assertEquals(1, solution.wiggleMaxLength(new int[] {1, 1}));
        assertEquals(2, solution.wiggleMaxLength(new int[] {-1, 1}));
        assertEquals(2, solution.wiggleMaxLength(new int[] {1, 2, 3, 4, 5, 6}));
    }
}