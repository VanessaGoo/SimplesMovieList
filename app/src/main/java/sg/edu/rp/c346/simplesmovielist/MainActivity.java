package sg.edu.rp.c346.simplesmovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Step 1b : Create a variable for list view
    ListView lvMovie;

    // Step 2a : Create an array list variable
    ArrayList<String> alMovieList;

    // Step 3 : Create an Array adapter
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 1c : Bind the UI element to the java variable
        lvMovie = findViewById(R.id.listViewMovie);

        // Step 2b : Initialize the Array List
        alMovieList = new ArrayList<>();

        // Step 2c : Add data into the Array List
        alMovieList.add("Avengers Infinity War Release Date: 2018.04");
        alMovieList.add("Justice League Release Date: 2017.11");

        // Step 3b : Initialize the Array Adapter and bind it to the Array List
        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,alMovieList);

        // Step 4 : Bind the list view to the array adapter
        lvMovie.setAdapter(aaMovie);
    }
}
