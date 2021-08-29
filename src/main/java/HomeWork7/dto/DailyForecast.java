package HomeWork7.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyForecast {

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Temperature")
    private Temperature temperature;

    @JsonProperty ("Day")
    private Day day;

    public DailyForecast() {

    }

    public DailyForecast(String date, Temperature temperature, Day day) {
        this.date = date;
        this.temperature = temperature;
        this.day = day;
    }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public Temperature getTemperature() { return temperature; }

    public void setTemperature(Temperature temperature) { this.temperature = temperature;}

    public Day getDay() { return day; }

    public void setDay(Day day) { this.day = day; }

    @Override
    public String toString() {
        return "DailyForecast{" +
                "date='" + date + '\'' +
                ", temperature=" + temperature +
                ", day=" + day +
                '}';
    }
}
