package com.example.portfoilio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list=findViewById(R.id.recycler_view_projects);
        Project[] projects={
                new Project("KnowBMI","it calculates bmi",R.drawable.tape),
                new Project("Barbeque Villa","A menu App of a hotel",R.drawable.hungry_developer),
                new Project("BucketList","to store the places to go and thing to do",R.drawable.bucket),
                new Project("Portfolio","It show the Apps projects that we have built",R.drawable.portf)

        };
        ProjectsAdapter adapter=new ProjectsAdapter(projects);
        list.setAdapter(adapter);






    }
}