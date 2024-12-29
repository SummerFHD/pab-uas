package com.example.uaspab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KeahlianAdapter extends RecyclerView.Adapter<KeahlianAdapter.KeahlianViewHolder> {

    private List<KeahlianModel> keahlianList;

    public KeahlianAdapter(List<KeahlianModel> keahlianList) {
        this.keahlianList = keahlianList;
    }

    @NonNull
    @Override
    public KeahlianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_keahlian, parent, false);
        return new KeahlianViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KeahlianViewHolder holder, int position) {
        KeahlianModel keahlian = keahlianList.get(position);
        holder.tvNo.setText(keahlian.getNo());
        holder.tvKeahlian.setText(keahlian.getKeahlian());
        holder.tvItem.setText(keahlian.getItem());
    }

    @Override
    public int getItemCount() {
        return keahlianList.size();
    }

    static class KeahlianViewHolder extends RecyclerView.ViewHolder {
        TextView tvNo, tvKeahlian, tvItem;

        public KeahlianViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNo = itemView.findViewById(R.id.tvNo);
            tvKeahlian = itemView.findViewById(R.id.tvKeahlian);
            tvItem = itemView.findViewById(R.id.tvItem);
        }
    }
}
