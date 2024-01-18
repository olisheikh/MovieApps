package com.example.mymovieapp.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.mymovieapp.model.Movie;
import com.example.mymovieapp.repository.MovieRepository;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    MovieRepository movieRepository;

    public MainActivityViewModel(@NotNull Application application) {
        super(application);

        this.movieRepository = new MovieRepository(application);
    }

    public LiveData<List<Movie>> getAllMovies() {
        return movieRepository.getMutableLiveData();
    }
}
