package com.belajar.testingmtr.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class LaporanValidatorTest {

    public LaporanValidator validator = new LaporanValidator();

    @Test
    public void whenInputIsValid(){
        String berat = "100";
        String gambar_string = "foto.jpg";
        String koordinat = "-5.178108, 119.421604";
        String alamat = "Jl Daeng Tata 1";
        String keterangan = "Ket";
        String tanggal = "1 Januari 2021";

        assertThat(validator.validasiInput(berat, gambar_string, koordinat, alamat, keterangan,
                tanggal)).isEqualTo(true);
    }
}