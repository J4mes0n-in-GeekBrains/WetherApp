package HomeWork7.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Minimum {

    @JsonProperty("Value")
    private double value;

    @JsonProperty("Unit")
    private String unit;

    public Minimum() {
    }

    public Minimum(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() { return value; }

    public void setValue(double value) { this.value = value; }

    public String getUnit() { return unit; }

    public void setUnit(String unit) { this.unit = unit; }

    @Override
    public String toString() {
        return "Minimum{" +
                "Value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
