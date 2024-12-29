package com.example.uaspab;

public class PengalamanModel {
    private String no;
    private String posisi;
    private String periode;
    private String perusahaan;

    // Constructor to initialize all fields
    public PengalamanModel(String no, String posisi, String periode, String perusahaan) {
        this.no = no;
        this.posisi = posisi;
        this.periode = periode;
        this.perusahaan = perusahaan;
    }

    // Getter for 'no'
    public String getNo() {
        return no;
    }

    // Getter for 'posisi'
    public String getPosisi() {
        return posisi;
    }

    // Getter for 'periode'
    public String getPeriode() {
        return periode;
    }

    // Getter for 'perusahaan'
    public String getPerusahaan() {
        return perusahaan;
    }
}
