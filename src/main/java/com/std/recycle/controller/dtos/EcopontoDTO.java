package com.std.recycle.controller.dtos;

import com.std.recycle.model.Ecoponto;
import com.std.recycle.model.Endereco;
import com.std.recycle.model.Residuo;

import java.util.ArrayList;

public class EcopontoDTO {
    private double latitude;
    private double longitude;
    private ArrayList<Residuo> residuos;
    private Endereco endereco;

    public EcopontoDTO(Ecoponto ecoponto) {
        this.latitude = ecoponto.getLatitude();
        this.longitude = ecoponto.getLongitude();
        this.residuos = ecoponto.getResiduos();
        this.endereco = ecoponto.getEndereco();
    }
}
