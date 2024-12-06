import java.net.http.HttpClient;
import java.util.concurrent.CompletableFuture;

/**
 * Weather Service Client Exercise
 *
 * Use https://open-meteo.com/ API to retrieve weather data
 * 
 * Use the simplest possible call as shown in the curl example on open-meteo.com:
 * queryString: "?latitude=48.8566&longitude=2.3522&current_weather=true"
 * 
 * ❯ curl 'https://api.open-meteo.com/v1/forecast?latitude=48.8566&longitude=2.3522&current_weather=true'
 * {"latitude":48.86,"longitude":2.3599997,"generationtime_ms":0.08499622344970703,"utc_offset_seconds":0,"timezone":"GMT","timezone_abbreviation":"GMT","elevation":36.0,"current_weather_units":{"time":"iso8601","interval":"seconds","temperature":"°C","windspeed":"km/h","winddirection":"°","is_day":"","weathercode":"wmo
 * code"},"current_weather":{"time":"2024-12-01T14:00","interval":900,"temperature":8.3,"windspeed":8.2,"winddirection":165,"is_day":1,"weathercode":3}}
 * 
 * Key Features Demonstrated:
 * - Modern HTTP Client (Java 11+)
 * - Async operations
 * - Request/Response handling
 * - Error handling
 * - Timeout configuration
 */
public class WeatherServiceExercise {

    record WeatherData(String location, String jsonData) {
        @Override
        public String toString() {
            return "Weather in %s: %.1f°C, %s".formatted(location, jsonData);
        }
    }

    static class WeatherClient {
        private final HttpClient client;
        private final String apiBaseUrl;

        public WeatherClient(String apiBaseUrl) {
            // TODO 1: Initialize HttpClient with:
            // - HTTP/2 support
            // - 10-second connection timeout
            // - Default redirect policy
            this.apiBaseUrl = apiBaseUrl;
            this.client = null; // Implement this
        }

        public WeatherData getWeather(String location) throws Exception {
            // TODO 2: Create and send HTTP request for weather data
            // Use appropriate request headers and timeout
            return null; // Implement this
        }

        public CompletableFuture<WeatherData> getWeatherAsync(String location) {
            // TODO 3: Implement async version of weather data retrieval
            return null; // Implement this
        }
    }

    public static void main(String[] args) throws Exception {
        // Using a mock API endpoint for demonstration
        WeatherClient client = new WeatherClient(
                "https://api.weather.example.com"
        );

        // TODO 4: Test synchronous weather retrieval

        // TODO 5: Test asynchronous weather retrieval

        // TODO 6: Demonstrate error handling
    }
}
