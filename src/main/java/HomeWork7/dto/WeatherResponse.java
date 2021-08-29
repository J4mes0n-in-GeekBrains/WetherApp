package HomeWork7.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @JsonProperty("DailyForecasts")
    public List<DailyForecast> dailyForecasts;

    public WeatherResponse() {
    }

    public WeatherResponse(List<DailyForecast> dailyForecasts) { this.dailyForecasts = dailyForecasts; }

    public List<DailyForecast> getDailyForecasts() {return dailyForecasts; }

    public void setDailyForecasts(List<DailyForecast> dailyForecasts) {this.dailyForecasts = dailyForecasts; }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "dailyForecasts=" + dailyForecasts +
                '}';
    }
}

