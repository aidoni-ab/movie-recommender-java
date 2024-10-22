# Movie Recommendation System

This is a simple Movie Recommendation System built with Java and Spring Boot. The application fetches movie data from The Movie Database (TMDb) API and provides movie recommendations based on user preferences.

## Features

- Search for movies by genre, keyword, or top-rated.
- Display movie details including title, release date, overview, rating, and poster image.
- Allow users to rate movies and get recommendations based on their preferences.

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- Java 11 or higher
- Maven
- Git

### TMDb API Key

You will need an API key from TMDb to access the movie data. Sign up for an API key at [TMDb API](https://www.themoviedb.org/documentation/api).

### Project Setup

1. **Clone the repository**

   Run the following commands in your terminal:

    ```bash
    git clone git@github.com:aidoni-ab/movie-recommender-java.git
    cd movie-recommendation-system
    ```

2. **Configure the API key**

   Create a file named `application.properties` in the `src/main/resources` directory and add your TMDb API key:

    ```bash
    tmdb.api.key=YOUR_API_KEY_HERE
    ```

3. **Build the project**

   Use Maven to build the project:

    ```bash
    mvn clean install
    ```

4. **Run the application**

   Start the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:8080`.

### Endpoints

#### Search Movies

- **Endpoint:** /movies/search
- **Method:** GET
- **Parameters:** query (String) - The search query
- **Example:** <http://localhost:8080/movies/search?query=Inception>

#### Get Recommendations

- **Endpoint:** /movies/recommendations
- **Method:** GET
- **Description:** This endpoint will provide movie recommendations based on user ratings and preferences.

### Running Tests

To run the tests, use the following command:
    ```bash
    mvn test
    ```

### Project Structure

```css
src/main/java
    └── se
        └── aidoni
            └── movierecommender
                ├── Application.java
                ├── MovieController.java
                ├── MovieService.java
                ├── Movie.java
                └── TmdbResponse.java
``````

### Future Enhancements

- Implement user authentication and authorization.
- Enhance the recommendation logic to provide more personalized recommendations.
- Add more endpoints for different types of searches (e.g., by genre, actor).
- Improve the user interface for a better user experience.

### Contributing

We welcome contributions to enhance the functionality and features of this project. If you have any suggestions or improvements, please create an issue or submit a pull request.

### License

This project is licensed under the MIT License. See the LICENSE file for details.

### Acknowledgements

- [TMDb API](https://www.themoviedb.org/documentation/api) for providing the movie data.
