import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApiClient {

    public static void main(String[] args) {
        // Example coordinates (Delhi, India)
        double latitude = 28.6139;
        double longitude = 77.2090;

        // API URL
        String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude +
                        "&longitude=" + longitude + "&current_weather=true";

        try {
            // Step 1: Create URL and HTTP connection
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Step 2: Check for successful response
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HTTP GET request failed. Code: " + responseCode);
            }

            // Step 3: Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder responseBuilder = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                responseBuilder.append(inputLine);
            }
            in.close();

            // Step 4: Parse JSON response
            JSONObject json = new JSONObject(responseBuilder.toString());
            JSONObject weather = json.getJSONObject("current_weather");

            // Step 5: Extract and display structured data
            System.out.println(" Weather Data ");
            System.out.println("Location : Delhi");
            System.out.println("Time     : " + weather.getString("time"));
            System.out.println("Temp     : " + weather.getDouble("temperature") + " °C");
            System.out.println("Wind     : " + weather.getDouble("windspeed") + " km/h");

        } catch (Exception e) {
            System.out.println("Error: Unable to fetch weather data");
            e.printStackTrace();
        }
    }
}
