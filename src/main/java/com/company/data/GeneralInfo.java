package com.company.data;

import com.company.data.custom.DemandModel;
import com.company.data.custom.NetworkType;
import com.company.data.custom.Spectrum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneralInfo {
    public GeneralInfo(Map<String, String> values) {
        this.values = values;
    }

    public String getScenarioId() {
        return values.get("SCENARIO_ID");
    }

    public String getAnnotation() {
        return values.get("ANNOTATION");
    }

    public NetworkType getNetworkType() {
        if (values.get("NETWORK_TYPE").equals("GSM900"))
            return NetworkType.GSM900;
        return NetworkType.GSM1800;
    }

    public Spectrum getSpectrum() {
        String temp = values.get("SPECTRUM");
        var splitResult = temp.split(",");
        var val1 = splitResult[0].replace(" ", "");
        var val2 = splitResult[1].replace(" ", "");
        return new Spectrum(Integer.parseInt(val1.substring(1)), Integer.parseInt(val2.substring(0, val2.length() - 1)));
    }

    public int getGloballyBlockedChannels() {
        return Integer.parseInt(values.get("GLOBALLY_BLOCKED_CHANNELS"));
    }

    public int getCoSiteSeparation() {
        return Integer.parseInt(values.get("CO_SITE_SEPARATION"));
    }

    public List<Integer> getHandoverSeparation() {
        var temp=values.get("HANDOVER_SEPARATION").replace(";", "").split("\\s+");
        return Arrays.stream(temp)
                .skip(1)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public double getMinimalSignificationInterference() {
        return Double.parseDouble(values.get("NETWORK_TYPE"));
    }

    public double getMaximalSignificantInterference() {
        return Double.parseDouble(values.get("NETWORK_TYPE"));
    }

    public DemandModel getDemanModel() {
        if (values.get("DEMAND_MODEL").equals("ABSOLUTE"))
            return DemandModel.ABSOLUTE;
        return DemandModel.NORMALIZED_TRAFFIC;
    }

    public Map<String, String> getValues() {
        return values;
    }

    @Override
    public String toString() {
        getSpectrum();
        StringBuilder buffer = new StringBuilder();
        String sRepeated;
        buffer.append("\nGeneralInfo {");
        for (var value : values.entrySet()) {
            sRepeated = IntStream.range(0, 33 - value.getKey().length()).mapToObj(i -> " ").collect(Collectors.joining(""));
            buffer.append("\n     ").append(value.getKey()).append(sRepeated).append(value.getValue()).append(";");

        }
        buffer.append("\n}\n\n");
        return buffer.toString();
    }

    public boolean getSiteLocations() {
        return values.get("SITE_LOCATIONS").equals("1");
    }

    private Map<String, String> values;

}
