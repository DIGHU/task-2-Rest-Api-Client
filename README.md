# task-2-Rest-Api-Client

# COMPANY: CODTECH IT SOLUTIONS

# NAME:Dirghayush Umakant Sogale

# INTERN ID: :CITS0D178

# DOMAIN: CORE JAVA /  REST API CLIENT

# DURATION: 4 WEEKS

# MENTOR: NEELA SANTOSH


# DESCRIPTION OF TASK:

The objective of this internship task was to build a simple yet functional Java-based REST API client application that consumes data from a public API and presents it in a structured format. For this, I developed a weather information client using the Open-Meteo Weather API.

The application was designed to send an HTTP GET request to the Open-Meteo API using Java’s built-in `HttpURLConnection` class. The API request used geographical coordinates (latitude and longitude) to fetch real-time weather data for a specific location — for example, Mumbai. The response from the API was in JSON format, which is commonly used for structured data exchange over the internet.

To process the JSON response, I integrated the org.json library (`json-20210307.jar`) into my Java project. This library allowed the program to parse the JSON response string and extract specific fields such as temperature, windspeed, and timestamp from the `current_weather` JSON object.

After retrieving and parsing the data, the application displayed it to the user in a clean, readable format through the console. This helped simulate how a basic REST client works in Java without any external frameworks.

From this task, I learned how to:
* Use Java to make HTTP requests to public APIs.
* Handle network responses and possible exceptions like I/O errors or malformed URLs.
* Parse JSON data using third-party libraries.
* Present data in a meaningful way for end users.

The development environment used for this project was Visual Studio Code, and the project included two main files: a Java source file (`WeatherApiClient.java`) and a JSON parsing library placed in a `lib/` folder.

This task helped strengthen my understanding of core Java concepts, web integration, and real-time data processing, which are essential in many modern applications. It also demonstrated how Java can be used outside of backend development, especially in API-driven tools and automation scripts.

