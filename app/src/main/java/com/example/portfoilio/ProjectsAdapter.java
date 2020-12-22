package com.example.portfoilio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.projectViewHolder> {

    private Project[] projects ;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }


    @NonNull
    @Override
    public projectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project,parent,false);




        return new projectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull projectViewHolder holder, int position) {
     holder.bind(projects[position]);
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }
    static class projectViewHolder extends RecyclerView.ViewHolder{
        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;
        public projectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage=itemView.findViewById(R.id.image_icon);
            appTitle=itemView.findViewById(R.id.text_view_title);
            appDescription=itemView.findViewById(R.id.text_view_description);
        }

        public void bind(Project project) {
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);

        }
    }




}
