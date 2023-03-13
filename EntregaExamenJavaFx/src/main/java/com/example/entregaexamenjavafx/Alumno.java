package com.example.entregaexamenjavafx;

public class Alumno {
    Integer id;
    String nombre;
    Double ad;
    Double sge;
    Double di;
    Double pmdm;
    Double psp;
    Double eie;
    Double hlc;

    public Alumno(Integer id, String nombre, String apellidos, Double ad, Double sge, Double di, Double pmdm, Double psp, Double eie, Double hlc) {
        this.id = id;
        this.nombre = nombre + " " + apellidos;
        this.ad = ad;
        this.sge = sge;
        this.di = di;
        this.pmdm = pmdm;
        this.psp = psp;
        this.eie = eie;
        this.hlc = hlc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAd() {
        return ad;
    }

    public void setAd(Double ad) {
        this.ad = ad;
    }

    public Double getSge() {
        return sge;
    }

    public void setSge(Double sge) {
        this.sge = sge;
    }

    public Double getDi() {
        return di;
    }

    public void setDi(Double di) {
        this.di = di;
    }

    public Double getPmdm() {
        return pmdm;
    }

    public void setPmdm(Double pmdm) {
        this.pmdm = pmdm;
    }

    public Double getPsp() {
        return psp;
    }

    public void setPsp(Double psp) {
        this.psp = psp;
    }

    public Double getEie() {
        return eie;
    }

    public void setEie(Double eie) {
        this.eie = eie;
    }

    public Double getHlc() {
        return hlc;
    }

    public void setHlc(Double hlc) {
        this.hlc = hlc;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre='" + nombre + '\'' + ", ad=" + ad + ", sge=" + sge + ", di=" + di + ", pmdm=" + pmdm + ", psp=" + psp + ", eie=" + eie + ", hlc=" + hlc + '}';
    }
}
