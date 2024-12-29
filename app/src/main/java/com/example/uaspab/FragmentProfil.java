package com.example.uaspab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentProfil extends Fragment {

    private static final String ARG_TYPE = "type";

    public static FragmentProfil newInstance(String type) {
        FragmentProfil fragment = new FragmentProfil();
        Bundle args = new Bundle();
        args.putString(ARG_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profil, container, false);

        TextView tvJudul = view.findViewById(R.id.tvJudul);
        TextView tvData = view.findViewById(R.id.tvData);

        String type = getArguments() != null ? getArguments().getString(ARG_TYPE) : "Profil";

        tvJudul.setText(type);
        switch (type) {
            case "Pendidikan":
                tvData.setText("1. TK - 2000\n2. SD - 2006\n3. SMP - 2012");
                break;
            case "Keahlian":
                tvData.setText("1. Programming\n2. Desain\n3. Analisis Data");
                break;
            case "Pengalaman":
                tvData.setText("1. Frontend Developer - 2020\n2. Backend Developer - 2022");
                break;
            default:
                tvData.setText("");
        }

        return view;
    }
}
