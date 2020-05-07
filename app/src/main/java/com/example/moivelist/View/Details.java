package com.example.moivelist.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moivelist.R;

public class Details extends AppCompatActivity {

    private TextView title , category , year ;
    private ImageView imageView;
    private Bundle bundle ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        bundle = getIntent().getExtras();
        title = findViewById(R.id.detials_title);
        year = findViewById(R.id.details_year);
        category = findViewById(R.id.details_category);
        imageView = findViewById(R.id.imageView2);

        if (bundle != null){
            title.setText(bundle.getString("title"));
            year.setText(bundle.getString("year"));
            category.setText(bundle.getString("category"));
            imageView.setImageResource(bundle.getInt("image"));
        }


    }
}
