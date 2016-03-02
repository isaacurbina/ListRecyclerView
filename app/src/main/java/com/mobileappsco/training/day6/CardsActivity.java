package com.mobileappsco.training.day6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class CardsActivity extends AppCompatActivity {

    /*ImageView person_photo;
    TextView person_name;
    TextView person_age;*/
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        // CardView
        /*person_photo = (ImageView) findViewById(R.id.person_photo);
        person_name = (TextView) findViewById(R.id.person_name);
        person_age = (TextView) findViewById(R.id.person_age);

        person_name.setText("Person name goes here");
        person_age.setText("Age goes here");
        Glide.with(this)
                .load("http://laurencecchi.com/wp-content/uploads/2014/11/Emma-Watson-images.jpg")
                .placeholder(android.R.drawable.gallery_thumb)
                .into(person_photo);*/

        //RecyclerView
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        initializeData();
        RVAdapter adapter = new RVAdapter(this, persons);
        rv.setAdapter(adapter);
    }

    // This method creates an ArrayList that has three Person objects
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson",
                "23 years old",
                "http://images-cdn.moviepilot.com/image/upload/v1426602397/bb1f41c779b62689a8bc5dc7824db057_large-it-felt-like-incest-emma-watson-expresses-her-views-on-kissing-rupert-grint-jpeg-236998.jpg"));
        persons.add(new Person("Lavery Maiss",
                "25 years old",
                "https://upload.wikimedia.org/wikipedia/commons/d/d5/Lavery_Maiss_Auras.jpg"));
        persons.add(new Person("Lillie Watts",
                "35 years old",
                "https://pbs.twimg.com/profile_images/484454177234354176/krKCnYiT.jpeg"));
        persons.add(new Person("Isaac Urbina",
                "26 years old",
                "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcS68XTbYy9ud2ApFvS1gXCAmC3PsxhoL0PpJ79kM89s-g8jo3ti"));
    }

}
