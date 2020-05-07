package com.example.moivelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.moivelist.Controller.MovieAdapter;
import com.example.moivelist.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView ;
    private MovieAdapter movieAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        movieAdapter =new MovieAdapter(this,movieList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);

        MoviesData();
    }

    private void MoviesData() {
        Movie movie = new Movie("The Shawshank Redemption","Drama","(1994)",R.drawable.image);
        movieList.add(movie);
        Movie movie2 = new Movie("The Godfather"," Crime, Drama","(1972)",R.drawable.image2);
        movieList.add(movie2);
        Movie movie3 = new Movie("The Godfather: Part II","Crime, Drama ","(1974)",R.drawable.image3);
        movieList.add(movie3);
        Movie movie4 = new Movie("The Dark Knight"," Action, Crime, Drama","(2008)",R.drawable.image4);
        movieList.add(movie4);
        Movie movie5 = new Movie("12 Angry Men","Drama","(1957)",R.drawable.image5);
        movieList.add(movie5);
        Movie movie6 = new Movie("Schindler's List"," Biography, Drama, History","(1993)",R.drawable.image6);
        movieList.add(movie6);
        Movie movie7 = new Movie("The Lord of the Rings: The Return of the King"," Adventure, Drama, Fantasy","(2003)",R.drawable.image7);
        movieList.add(movie7);
        Movie movie8 = new Movie("Pulp Fiction"," Biography, Drama, History","(1994)",R.drawable.image8);
        movieList.add(movie8);
        Movie movie9 = new Movie("The Good, the Bad and the Ugly"," Crime, Drama","(1966)",R.drawable.image9);
        movieList.add(movie9);
        Movie movie10 = new Movie("Fight Club"," Drama ","(1999)",R.drawable.image10);
        movieList.add(movie10);

        movieAdapter.notifyDataSetChanged();
    }
}
