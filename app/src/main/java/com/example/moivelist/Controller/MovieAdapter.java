package com.example.moivelist.Controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moivelist.Model.Movie;
import com.example.moivelist.R;
import com.example.moivelist.View.Details;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {


    private List<Movie> movieList;
    private Context context;

    public MovieAdapter(Context context, List movieList) {
        this.movieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.moive_list_row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.category.setText(movie.getCategory());
        holder.year.setText(movie.getYear());
        holder.imageView.setImageResource(movie.getImage());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView title , category , year ;
        ImageView imageView ;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.txt_title);
            year = itemView.findViewById(R.id.txt_year);
            category = itemView.findViewById(R.id.txt_category);
            imageView = itemView.findViewById(R.id.imageView);

        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            Movie movie = movieList.get(position);
            Intent intent =new Intent(context, Details.class);
            intent.putExtra("title",movie.getTitle());
            intent.putExtra("year",movie.getYear());
            intent.putExtra("category",movie.getCategory());
            intent.putExtra("image",movie.getImage());
            context.startActivity(intent);

        }
    }
}
