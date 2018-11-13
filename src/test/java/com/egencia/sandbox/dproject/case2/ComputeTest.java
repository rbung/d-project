package com.egencia.sandbox.dproject.case2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Compute class which handle object as parameter")
class ComputeTest {

    @Test
    @DisplayName("Should multiply by 2 correctly")
    void shouldComputeCorrectly() {
        // When
        Output output = Compute.multiplyBy2(new Input(3));

        // Then
        // TODO add assertions
    }

}