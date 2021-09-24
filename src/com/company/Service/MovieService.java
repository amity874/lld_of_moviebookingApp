package com.company.Service;
import com.company.Movies;
import com.company.User;
public interface MovieService {
    /**
     * allow user to search the movie
     ***/
    public Movies findMovieByName(String name);
    public Movies findMovieById(String id);
    /**
     Create a movie -- only admin should be allowed
     */
    public Movies createMovie(User user);
    public Movies updateMovie(User user);
}
