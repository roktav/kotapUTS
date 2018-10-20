package com.apap.utz.repository;

import com.apap.utz.model.RuanganModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuanganDB extends JpaRepository<RuanganModel, Long> {
    RuanganModel findById(int id);
}
