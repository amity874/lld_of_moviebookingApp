package com.company.Service;
import com.company.Movies;
import com.company.Theatre;
import com.company.User;

import java.util.List;
public interface TheaterService {
    public List<Theatre> findTheaterByZipCode(int zipCode);
    public Theatre findTheaterByName(String name);
    public List<Movies> findMoviesInATheatre(String theaterName);
    public void addMoviesInATheater(String theatreName , long movieId , User user);
    public void removeMoviesInATheater(String theatreName , long movieId , User user);
}
