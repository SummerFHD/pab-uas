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

public class FragmentProfilKeahlian extends Fragment {

    public static FragmentProfilKeahlian newInstance(String type) {
        FragmentProfilKeahlian fragment = new FragmentProfilKeahlian();
        Bundle args = new Bundle();
        args.putString("type", type); // Jika butuh argumen
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate layout fragment
        View view = inflater.inflate(R.layout.fragment_profil_keahlian, container, false);

        // Temukan RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewKeahlian);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Data Keahlian
        List<KeahlianModel> keahlianList = new ArrayList<>();
        keahlianList.add(new KeahlianModel("1", "Programming", "Java, Kotlin"));
        keahlianList.add(new KeahlianModel("2", "Design", "Photoshop, Figma"));
        keahlianList.add(new KeahlianModel("3", "Database", "MySQL, PostgreSQL"));
        keahlianList.add(new KeahlianModel("4", "Networking", "Cisco, Mikrotik"));
        keahlianList.add(new KeahlianModel("5", "Leadership", "Team Management, Communication"));

        // Atur Adapter
        KeahlianAdapter adapter = new KeahlianAdapter(keahlianList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
