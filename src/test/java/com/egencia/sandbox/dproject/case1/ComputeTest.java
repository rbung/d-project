package com.egencia.sandbox.dproject.case1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Compute class which handle int as parameter")
class ComputeTest {

    @Test
    @DisplayName("Should multiply by 2 correctly")
    void shouldComputeCorrectly() {
        // When
        int result = Compute.multiplyBy2(3);

        // Then
        // TODO add assertions
    }
}