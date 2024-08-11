package org.arif2.schoolsystem.model.kelurahan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DusunModel {
    private Integer id;
    private String nama;
    private List<RWModel> rwModels = new ArrayList<>();

    public DusunModel(Integer id, String nama) {
        this.id = id;
        this.nama = nama;
    }
}
