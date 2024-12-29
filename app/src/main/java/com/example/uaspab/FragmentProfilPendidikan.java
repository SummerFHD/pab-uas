package com.example.uaspab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentProfilPendidikan extends Fragment {

    private static final String ARG_TYPE = "type"; // Kunci argumen
    private String type; // Tipe data (Pendidikan)

    public static FragmentProfilPendidikan newInstance(String type) {
        FragmentProfilPendidikan fragment = new FragmentProfilPendidikan();
        Bundle args = new Bundle();
        args.putString(ARG_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate layout fragment
        View view = inflater.inflate(R.layout.fragment_profil_pendidikan, container, false);

        // Ambil argumen tipe jika ada
        if (getArguments() != null) {
            type = getArguments().getString(ARG_TYPE);
        }

        // Temukan RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewPendidikan);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Data Pendidikan
        List<PendidikanModel> pendidikanList = new ArrayList<>();
        pendidikanList.add(new PendidikanModel("1", "TK", "2005 - 2006", "TK Asyiah Depok"));
        pendidikanList.add(new PendidikanModel("2", "SD", "2006 - 2012", "SDN 07 Depok"));
        pendidikanList.add(new PendidikanModel("3", "SMP", "2012 - 2015", "SMPN 01 Depok"));
        pendidikanList.add(new PendidikanModel("4", "SMA", "2015 - 2018", "SMAN 28 Jakarta"));
        pendidikanList.add(new PendidikanModel("5", "Sarjana", "2018 - Sekarang", "Universitas Pembangunan Jaya"));

        // Atur Adapter
        PendidikanAdapter adapter = new PendidikanAdapter(pendidikanList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
