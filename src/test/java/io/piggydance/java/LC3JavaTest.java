package io.piggydance.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC3JavaTest {
    @Test
    void test() {
        LC3Java s = new LC3Java();
        assertEquals(3, s.lengthOfLongestSubstring2("abcabc"));
        assertEquals(1, s.lengthOfLongestSubstring2("bbbbbb"));
        assertEquals(3, s.lengthOfLongestSubstring2("pwwkew"));
    }
}