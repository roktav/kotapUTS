package com.apap.utz.service;

import com.apap.utz.model.RuanganModel;

import java.util.List;

public interface RuanganService {
    List<RuanganModel> getRuanganList();
    RuanganModel getRuanganbyId(int id);
    void addRuangan(RuanganModel ruangan);
}
