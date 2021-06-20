package com.belajar.testingmtr.utils;

public class LaporanValidator {

    public static boolean validasiInput(String berat_sampah, String gambar_string, String koordinat_laporan,
                                        String alamat_laporan, String keterangan_send, String tanggal_sekarang) {

        return !(berat_sampah.isEmpty() || gambar_string.isEmpty() || koordinat_laporan.isEmpty() ||
                alamat_laporan.isEmpty() || keterangan_send.isEmpty() || tanggal_sekarang.isEmpty());
    }

}
