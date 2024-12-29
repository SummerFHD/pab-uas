package com.example.uaspab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PendidikanAdapter extends RecyclerView.Adapter<PendidikanAdapter.PendidikanViewHolder> {

    private List<PendidikanModel> pendidikanList;

    public PendidikanAdapter(List<PendidikanModel> pendidikanList) {
        this.pendidikanList = pendidikanList;
    }

    @NonNull
    @Override
    public PendidikanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pendidikan, parent, false);
        return new PendidikanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PendidikanViewHolder holder, int position) {
        PendidikanModel pendidikan = pendidikanList.get(position);
        holder.tvNo.setText(pendidikan.getNo());
        holder.tvPendidikan.setText(pendidikan.getPendidikan());
        holder.tvPeriode.setText(pendidikan.getPeriode());
        holder.tvAsalSekolah.setText(pendidikan.getAsalSekolah());
    }

    @Override
    public int getItemCount() {
        return pendidikanList.size();
    }

    static class PendidikanViewHolder extends RecyclerView.ViewHolder {
        TextView tvNo, tvPendidikan, tvPeriode, tvAsalSekolah;

        public PendidikanViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNo = itemView.findViewById(R.id.tvNo);
            tvPendidikan = itemView.findViewById(R.id.tvPendidikan);
            tvPeriode = itemView.findViewById(R.id.tvPeriode);
            tvAsalSekolah = itemView.findViewById(R.id.tvAsalSekolah);
        }
    }
}
