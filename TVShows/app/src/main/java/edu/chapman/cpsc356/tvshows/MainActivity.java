package edu.chapman.cpsc356.tvshows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView showsList;
    private List<String> tvShows = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateShows();

        this.showsList = (RecyclerView) findViewById(R.id.rv_shows);

        ShowAdapter adapter = new ShowAdapter(this, this.tvShows);
        this.showsList.setAdapter(adapter);

        this.showsList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void populateShows()
    {
        this.tvShows.add("Glee");
        this.tvShows.add("Dexter");
        this.tvShows.add("Bones");
        this.tvShows.add("Greys Anatomy");
        this.tvShows.add("The Walking Dead");
        this.tvShows.add("Shameless");
        this.tvShows.add("Mr. Robot");
        this.tvShows.add("Silicon Valley");
        this.tvShows.add("Breaking Bad");
        this.tvShows.add("Narcos");
        this.tvShows.add("Easy");
        this.tvShows.add("The Office");
        this.tvShows.add("Parks and Recreation");
        this.tvShows.add("Friends");
        this.tvShows.add("Black Mirror");
        this.tvShows.add("House of Cards");
        this.tvShows.add("Psych");
        this.tvShows.add("Game of Thrones");
        this.tvShows.add("Stranger Things");
        this.tvShows.add("American Horror Story");
    }
}
