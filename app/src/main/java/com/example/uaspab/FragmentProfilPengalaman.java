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

public class FragmentProfilPengalaman extends Fragment {

    private static final String ARG_TYPE = "type"; // Kunci argumen
    private String type; // Menyimpan tipe data (Pengalaman)

    // Metode newInstance untuk menerima argumen
    public static FragmentProfilPengalaman newInstance(String type) {
        FragmentProfilPengalaman fragment = new FragmentProfilPengalaman();
        Bundle args = new Bundle();
        args.putString(ARG_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate layout fragment
        View view = inflater.inflate(R.layout.fragment_profil_pengalaman, container, false);

        // Ambil argumen tipe
        if (getArguments() != null) {
            type = getArguments().getString(ARG_TYPE);
        }

        // Temukan RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewPengalaman);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Data Pengalaman
        List<PengalamanModel> pengalamanList = new ArrayList<>();
        pengalamanList.add(new PengalamanModel("1", "Frontend Developer", "2020 - 2021", "PT. Aplikasi Cerdas"));
        pengalamanList.add(new PengalamanModel("2", "Backend Developer", "2021 - 2022", "PT. Solusi Digital"));
        pengalamanList.add(new PengalamanModel("3", "UI/UX Designer", "2022 - Sekarang", "Freelance"));
        pengalamanList.add(new PengalamanModel("4", "Data Analyst", "2023", "Startup ABC"));
        pengalamanList.add(new PengalamanModel("5", "Trainer", "2023", "Komunitas IT"));

        // Atur Adapter
        PengalamanAdapter adapter = new PengalamanAdapter(pengalamanList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
