package com.example.rm.recyclerview2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PessoaAdapter extends RecyclerView.Adapter<PessoaViewHolder> {

    List<People> people;
    Context context;

    public PessoaAdapter(List<People> people) {
        this.people = people;
    }

    @NonNull
    @Override
    public PessoaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_people_detail,parent,false);
        PessoaViewHolder pessoaViewHolder = new PessoaViewHolder(view);
        return pessoaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PessoaViewHolder holder, int position) {
        holder.nameView.setText(people.get(position).getName());
        holder.ageView.setText(people.get(position).getAge());
        holder.photoIdView.setText(String.valueOf(people.get(position).getPhotoId()));
        holder.gradient(people.get(position).getBack_color());

    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
