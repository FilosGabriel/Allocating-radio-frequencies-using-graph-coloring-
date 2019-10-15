package com.company.data;

import com.company.data.custom.DemandModel;
import com.company.data.custom.NetworkType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GeneralInfoTest {
    static GeneralInfo generalInfo;
    static Map<String, String> data;

    @BeforeAll
    static void init() {
        data = new HashMap<>();
        data.put("SCENARIO_ID", "Tiny");
        data.put("ANNOTATION", "|This tiny scenario is used for explanation in the proposal for file formats for scenarios and frequency assignments.|");
        data.put("NETWORK_TYPE", "GSM900");
        data.put("SPECTRUM", "(5, 17)");
        data.put("CO_SITE_SEPARATION", "2");
        data.put("DEFAULT_CO_CELL_SEPARATION", "3");
        data.put("HANDOVER_SEPARATION", "2 1 2 1");
        data.put("", "#BCCH -> BCCH BCCH -> TCH TCH -> BCCH TCH -> TCH");
        data.put("DEMAND_MODEL", "ABSOLUTE");
        data.put("SITE_LOCATIONS", "1");
        generalInfo = new GeneralInfo(data);
    }

    @Test
    void getScenarioId() {
//        Act
        var id = generalInfo.getScenarioId();
//        Assert
        assertEquals("Tiny", id);
    }

    @Test
    void getAnnotation() {
        var annotation = generalInfo.getAnnotation();
        assertEquals("|This tiny scenario is used for explanation in the proposal for file formats for scenarios and frequency assignments.|", annotation);
    }

    @Test
    void getNetworkType() {
        var type = generalInfo.getNetworkType();
        assertEquals(NetworkType.GSM900, type);
    }

    @Test
    void getSpectrum() {
        var spectrum = generalInfo.getSpectrum();
        assertEquals(5, spectrum.getLower());
        assertEquals(17, spectrum.getHighest());

    }

    @Test
    void getGloballyBlockedChannels() {
        var channels = generalInfo.getGloballyBlockedChannels();
        assertEquals(1, channels);
    }

    @Test
    void getCoSiteSeparation() {
        var separation = generalInfo.getCoSiteSeparation();
        assertEquals(2, separation);
    }

    @Test
    void getHandoverSeparation() {
        var handover = generalInfo.getHandoverSeparation();
        List<Integer> list = Arrays.asList(2, 1, 2, 1);

        assertEquals(list, handover);

    }

    @Test
    void getMinimalSignificationInterference() {
        var minimalSignalInterference = generalInfo.getMinimalSignificationInterference();
        assertEquals(0, minimalSignalInterference);

    }

    @Test
    void getMaximalSignificantInterference() {
        var maximalSignalInterference = generalInfo.getMaximalSignificantInterference();
        assertEquals(0, maximalSignalInterference);
    }

    @Test
    void getDemanModel() {
        var model = generalInfo.getDemanModel();
        assertEquals(DemandModel.ABSOLUTE, model);

    }

    @Test
    void getValues() {
        var values = generalInfo.getValues();
        assertEquals(data, values);
    }

    @Test
    void testToString() {
        var string = generalInfo.toString();
        var expectedString = "GENERAL_INFORMATION {\n" +
                "  SCENARIO_ID                 Tiny;\n" +
                "  ANNOTATION                  |This tiny scenario is used for explanation in the proposal for file formats for scenarios and frequency assignments.|;\n" +
                "  NETWORK_TYPE                GSM900;\n" +
                "  SPECTRUM                    (5, 17);\n" +
                "  CO_SITE_SEPARATION          2;\n" +
                "  DEFAULT_CO_CELL_SEPARATION  3;\n" +
                "  HANDOVER_SEPARATION         2 1 2 1;\n" +
                "                              # BCCH->BCCH BCCH->TCH TCH->BCCH TCH->TCH\n" +
                "  DEMAND_MODEL                ABSOLUTE;\n" +
                "  SITE_LOCATIONS              1;\n" +
                "}";
        assertEquals(expectedString, string);
    }

    @Test
    void getSiteLocations() {
        var siteLocations = generalInfo.getSiteLocations();
        assertEquals(true, siteLocations);
    }
}