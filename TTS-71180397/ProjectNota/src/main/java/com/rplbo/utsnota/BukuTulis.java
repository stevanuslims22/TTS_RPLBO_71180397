package com.rplbo.utsnota;

public class BukuTulis extends  Barang {
    private String merk;

    public  BukuTulis (String deskripsi,String kodebarang, int harga, int berat){
        this.setDeskripsi(deskripsi);
        this.setKodebarang(kodebarang);
        this.setHarga(harga);
        this.setBerat(berat);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
    }
}
