package com.company.data.custom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemandModelTest {
    @Test
    void demandModelShouldHave3Value() {
        assertEquals(3, DemandModel.values().length);
    }

    void demandModelShouldHaveAbsoluteValue() {
        assertEquals("ABSOLUTE", DemandModel.ABSOLUTE.name());
    }

    void demandModelShouldHaveNormalizedTrafficValue() {
        assertEquals("NORMALIZED_TRAFFIC", DemandModel.NORMALIZED_TRAFFIC.name());
    }

}