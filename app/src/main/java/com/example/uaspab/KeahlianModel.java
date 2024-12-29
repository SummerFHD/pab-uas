package com.example.uaspab;

public class KeahlianModel {
    private String no;
    private String keahlian;
    private String item;

    public KeahlianModel(String no, String keahlian, String item) {
        this.no = no;
        this.keahlian = keahlian;
        this.item = item;
    }

    public String getNo() {
        return no;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public String getItem() {
        return item;
    }
}
