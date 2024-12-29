package com.example.uaspab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PengalamanAdapter extends RecyclerView.Adapter<PengalamanAdapter.PengalamanViewHolder> {

    private List<PengalamanModel> pengalamanList;

    public PengalamanAdapter(List<PengalamanModel> pengalamanList) {
        this.pengalamanList = pengalamanList;
    }

    @NonNull
    @Override
    public PengalamanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pengalaman, parent, false);
        return new PengalamanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PengalamanViewHolder holder, int position) {
        PengalamanModel pengalaman = pengalamanList.get(position);
        holder.tvNo.setText(pengalaman.getNo());
        holder.tvPosisi.setText(pengalaman.getPosisi());
        holder.tvPeriode.setText(pengalaman.getPeriode());
        holder.tvPerusahaan.setText(pengalaman.getPerusahaan());
    }

    @Override
    public int getItemCount() {
        return pengalamanList.size();
    }

    static class PengalamanViewHolder extends RecyclerView.ViewHolder {
        TextView tvNo, tvPosisi, tvPeriode, tvPerusahaan;

        public PengalamanViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNo = itemView.findViewById(R.id.tvNo);
            tvPosisi = itemView.findViewById(R.id.tvPosisi);
            tvPeriode = itemView.findViewById(R.id.tvPeriode);
            tvPerusahaan = itemView.findViewById(R.id.tvPerusahaan);
        }
    }
}
