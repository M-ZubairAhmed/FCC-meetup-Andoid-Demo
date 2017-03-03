package com.fcchyd.androidonefcc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<TaskData> {

    private Context context;
    private ArrayList<TaskData> arrayList;

    public CustomArrayAdapter(@NonNull Context context, @NonNull ArrayList<TaskData> arrayList) {
        super(context, 0, arrayList);
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        final TaskData taskData = getItem(position);
        if (view == null){
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(R.layout.row_arrayadapter,parent,false);
        }

        TextView taskTextView = (TextView) view.findViewById(R.id.task_text_field);
        taskTextView.setText(taskData.getTask());

        ImageView deleteButton = (ImageView) view.findViewById(R.id.task_delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.remove(taskData);
                notifyDataSetChanged();
            }
        });
        return view;
    }
}
