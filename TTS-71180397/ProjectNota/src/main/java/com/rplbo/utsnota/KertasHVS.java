package com.rplbo.utsnota;

public class KertasHVS extends Barang {
    private int gram;

    public KertasHVS (String deskripsi,String kodebarang, int harga, int berat){
        super();
        this.setDeskripsi(deskripsi);
        this.setKodebarang(kodebarang);
        this.setHarga(harga);
        this.setBerat(berat);
    }
}
