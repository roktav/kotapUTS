package com.apap.utz.model;

import com.sun.tools.javah.Gen;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "ruangan")
public class RuanganModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(max = 32)
    @Column(name = "kode_ruang", nullable = false, unique = true)
    private String kode_ruang;

    @NotNull
    @Size(max = 255)
    @Column(name = "deskripsi", nullable = false)
    private String deskripsi;

    @NotNull
    @Column(name = "tipe", nullable = false)
    private int tipe;

    @NotNull
    @Column(name = "panjang", nullable = false)
    private double panjang;

    @NotNull
    @Column(name = "lebar", nullable = false)
    private int lebar;

    @NotNull
    @Column(name = "harga_sewa", nullable = false)
    private double harga_sewa;

    @NotNull
    @Size(max = 255)
    @Column(name = "lokasi", nullable = false)
    private String lokasi;

    @NotNull
    @Size(max = 255)
    @Column(name = "fasilitas", nullable = false)
    private String fasilitas;

    @NotNull
    @Column(name = "status", nullable = false)
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode_ruang() {
        return kode_ruang;
    }

    public void setKode_ruang(String kode_ruang) {
        this.kode_ruang = kode_ruang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getTipe() {
        return tipe;
    }

    public void setTipe(int tipe) {
        this.tipe = tipe;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public double getHarga_sewa() {
        return harga_sewa;
    }

    public void setHarga_sewa(double harga_sewa) {
        this.harga_sewa = harga_sewa;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
