package org.arif2.schoolsystem.model.kelurahan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RWModel {
    private Integer id;
    private String nama;
    private String namaRw;
    private List<RTModel> rtModels = new ArrayList<>();

    public RWModel(Integer id, String nama, String namaRw) {
        this.id = id;
        this.nama = nama;
        this.namaRw = namaRw;
    }
}
