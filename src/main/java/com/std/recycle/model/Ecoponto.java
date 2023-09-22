package com.std.recycle.model;

import java.util.ArrayList;

public class Ecoponto {
    private double latitude;
    private double longitude;
    private ArrayList<Residuo> residuos;
    private Endereco endereco;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Residuo> getResiduos() {
        return residuos;
    }

    public void setResiduos(ArrayList<Residuo> residuos) {
        this.residuos = residuos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
