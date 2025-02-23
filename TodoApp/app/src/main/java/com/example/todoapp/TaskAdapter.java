package com.example.todoapp;
import com.example.todoapp.Task; 
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todoapp.R;
import com.google.android.material.button.MaterialButton;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private List<Task> tasks;
    private Task currentTask;

    public TaskAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        public TextView taskTextView;
        public MaterialButton taskButton;

        public TaskViewHolder(View itemView) {
            super(itemView);
            taskTextView = itemView.findViewById(R.id.taskTextView);
            taskButton = itemView.findViewById(R.id.taskButton);
        }
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_item, parent, false);
        return new TaskViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        currentTask = tasks.get(position);
        holder.taskTextView.setText(currentTask.getName());

        holder.taskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Button clicked for " + currentTask.getName(), Toast.LENGTH_SHORT).show();
                // Handle button click here (e.g., navigate to task details)
            }
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}