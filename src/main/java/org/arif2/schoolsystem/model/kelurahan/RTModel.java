package org.arif2.schoolsystem.model.kelurahan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RTModel {
    private Integer id;
    private String nama;
    private String namaRt;
    private List<WargaModel> wargaModels = new ArrayList<>();

    public RTModel(Integer id, String nama, String namaRt) {
        this.id = id;
        this.nama = nama;
        this.namaRt = namaRt;
    }
}
