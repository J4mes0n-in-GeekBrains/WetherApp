package HomeWork7.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Maximum {

    @JsonProperty("Value")
    private double value;

    @JsonProperty("Unit")
    private String unit;

    public Maximum() {
    }

    public  Maximum(double value, String unit){
        this.value = value;
        this.unit = unit;
    }

    public double getValue() { return value; }

    public void setValue(double value) { this.value = value; }

    public String getUnit() { return unit; }

    public void setUnit(String unit) { this.unit = unit; }

    @Override
    public String toString() {
        return "Maximum{" +
                "Value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
