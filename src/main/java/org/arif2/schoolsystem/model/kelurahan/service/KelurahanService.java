package org.arif2.schoolsystem.model.kelurahan.service;

import org.arif2.schoolsystem.model.kelurahan.KelurahanModel;

import java.util.List;
import java.util.Optional;

public interface KelurahanService {
    List<KelurahanModel> get();
    Optional<KelurahanModel> getById(int id);
//    Optional<KelurahanModel> save(String id, KelurahanModel);

}
