package org.arif2.schoolsystem.model.kelurahan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KelurahanModel {
    private Integer id;
    private String nama;
    private String kecamatan;
    private List<DusunModel> daftarDusun = new ArrayList<>();


    public KelurahanModel(Integer id, String nama, String kecamatan) {
        this.id = id;
        this.nama = nama;
        this.kecamatan = kecamatan;
    }


}
