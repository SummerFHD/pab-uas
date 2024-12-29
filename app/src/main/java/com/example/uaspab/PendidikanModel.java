package com.example.uaspab;

public class PendidikanModel {
    private String no;
    private String pendidikan;
    private String periode;
    private String asalSekolah;

    public PendidikanModel(String no, String pendidikan, String periode, String asalSekolah) {
        this.no = no;
        this.pendidikan = pendidikan;
        this.periode = periode;
        this.asalSekolah = asalSekolah;
    }

    public String getNo() {
        return no;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public String getPeriode() {
        return periode;
    }

    public String getAsalSekolah() {
        return asalSekolah;
    }
}
