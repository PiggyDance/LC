package io.piggydance.java;

import io.piggydance.kts.lc.LC41;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC41JavaTest {
    @Test
    void test() {
        LC41Java s = new LC41Java();
        assertEquals(3, s.firstMissingPositive(new int[] {1, 2, 0}));
        assertEquals(2, s.firstMissingPositive(new int[] {3, 4, -1, 1}));
        assertEquals(1, s.firstMissingPositive(new int[] {2, 2}));
        assertEquals(2, s.firstMissingPositive(new int[] {1, 1}));
    }
}