package HomeWork7.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    @JsonProperty("IconPhrase")
    private String iconPhrase;

    public Day() {
    }
    public Day(String iconPhrase) { this.iconPhrase = iconPhrase; }

    public String getIconPhrase() { return iconPhrase; }

    public void setIconPhrase(String iconPhrase) {this.iconPhrase = iconPhrase; }

    @Override
    public String toString() {
        return "Day{" +
                "iconPhrase='" + iconPhrase + '\'' +
                '}';
    }
}
