package com.example.myrecycleview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<ListItem> data;
    private Context context;

    public MyAdapter(List<ListItem> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
       View view = View.inflate(context,R.layout.list_item,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull MyAdapter.MyViewHolder holder, int position) {
         holder.tv.setText(data.get(position).getName());
         holder.sid.setText(data.get(position).getId());
         holder.chid.setText(data.get(position).getCHId());
    }

    @Override
    public int getItemCount() {
        return data == null ? 0:data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView  tv;
        private TextView  sid;
        private TextView  chid;
        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.txtv);
            sid = itemView.findViewById(R.id.sid);
            chid = itemView.findViewById(R.id.chid);
        }
    }
}
