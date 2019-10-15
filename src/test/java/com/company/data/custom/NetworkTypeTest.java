package com.company.data.custom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTypeTest {
    @Test
    void networkTypeShouldHave2Value() {
        assertEquals(2, NetworkType.values().length);
    }

    void networkTypeShouldHaveGSM900Value() {
        assertEquals("GSM900", NetworkType.GSM900.name());
    }

    void networkTypeShouldHaveGSM1800Value() {
        assertEquals("GSM1800", NetworkType.GSM1800.name());
    }

}