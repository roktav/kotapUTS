package com.apap.utz.service;

import com.apap.utz.model.RuanganModel;
import com.apap.utz.repository.RuanganDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RuanganServiceImp implements RuanganService {
    @Autowired
    RuanganDB ruanganDB;

    @Override
    public List<RuanganModel> getRuanganList() {
        return ruanganDB.findAll();
    }

    @Override
    public RuanganModel getRuanganbyId(int id) {
        return ruanganDB.findById(id);
    }

    @Override
    public void addRuangan(RuanganModel ruangan) {
        ruanganDB.save(ruangan);
    }
}
