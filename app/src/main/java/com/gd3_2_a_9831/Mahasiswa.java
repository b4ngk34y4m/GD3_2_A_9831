package com.gd3_2_a_9831;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Mahasiswa extends BaseObservable {
    public String nama;
    public String npm;
    public String fakultas;
    public String jurusan;
    public double ipk;
    public String hobi;

    public Mahasiswa() {}

    public Mahasiswa(String npm, String nama, String fakultas, String jurusan, double ipk, String hobi) {
        this.npm = npm;
        this.nama = nama;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.ipk = ipk;
        this.hobi = hobi;
    }

    @Bindable
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
        notifyPropertyChanged(BR.npm);
    }

    @Bindable
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        notifyPropertyChanged(BR.nama);
    }

    @Bindable
    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
        notifyPropertyChanged(BR.fakultas);
    }

    @Bindable
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
        notifyPropertyChanged(BR.jurusan);
    }

    @Bindable
    public double getIpk() { return ipk;}

    public void setIpk(double ipk) {
        this.ipk = ipk;
        notifyPropertyChanged(BR.ipk);
    }

    @Bindable
    public String getStringIpk() { return String.valueOf(ipk);}

    public void setStringIpk(String ipk) {
        if(!ipk.isEmpty()){
            this.ipk = Double.parseDouble(ipk);
        }else{
            this.ipk = 0;
        }
        notifyPropertyChanged(BR.ipk);
    }

    @Bindable

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
        notifyPropertyChanged(BR.hobi);
    }
}
