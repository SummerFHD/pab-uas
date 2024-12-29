package com.example.uaspab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FragmentBiodata extends Fragment {

    private Button btnPendidikan, btnKeahlian, btnPengalaman;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_biodata, container, false);

        // Temukan tombol berdasarkan ID
        btnPendidikan = view.findViewById(R.id.btnPendidikan);
        btnKeahlian = view.findViewById(R.id.btnKeahlian);
        btnPengalaman = view.findViewById(R.id.btnPengalaman);

        // Klik tombol Pendidikan
        btnPendidikan.setOnClickListener(v -> replaceFragment(FragmentProfilPendidikan.newInstance("PENDIDIKAN")));

        // Klik tombol Keahlian
        btnKeahlian.setOnClickListener(v -> replaceFragment(FragmentProfilKeahlian.newInstance("KEAHLIAN")));

        // Klik tombol Pengalaman
        btnPengalaman.setOnClickListener(v -> replaceFragment(FragmentProfilPengalaman.newInstance("PENGALAMAN")));



        return view;
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_tabel_container, fragment); // ID harus sesuai layout
        transaction.commit();
    }
}
