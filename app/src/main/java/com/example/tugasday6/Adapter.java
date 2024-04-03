package com.example.tugasday6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<NameMember> namaMember;
    private OnItemClickListener mListener;

    // Constructor with listener parameter
    public Adapter(ArrayList<NameMember> namaMember, OnItemClickListener listener) {
        this.namaMember = namaMember;
        this.mListener = listener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mListener = onItemClickListener;
    }

    // Interface for item click listener
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        if (namaMember != null && position < namaMember.size()) {
            holder.nama.setText(namaMember.get(position).getNamaMember());
            holder.Generasi.setText(namaMember.get(position).getGenerasi());
            holder.Asal.setText(namaMember.get(position).getAsal());
            holder.fotoMember.setImageResource(namaMember.get(position).getFotoMember());
        }
    }

    @Override
    public int getItemCount() {
        if (namaMember != null) {
            return namaMember.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView nama;
        TextView Generasi;
        TextView Asal;
        ImageView fotoMember;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.nama);
            Generasi = itemView.findViewById(R.id.gen);
            Asal = itemView.findViewById(R.id.asal);
            fotoMember = itemView.findViewById(R.id.fotomember);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mListener != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    mListener.onItemClick(position);
                }
            }
        }
    }
}
