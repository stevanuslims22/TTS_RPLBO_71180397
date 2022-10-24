package com.rplbo.utsnota;

public class Pulpen  extends Barang{
    private String warna;

    public Pulpen (String deskripsi,String kodebarang, int harga, int berat){
        super();
        this.setDeskripsi(deskripsi);
        this.setKodebarang(kodebarang);
        this.setHarga(harga);
        this.setBerat(berat);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
    }
}
