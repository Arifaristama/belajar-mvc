package org.arif2.schoolsystem.model.v2;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kelurahan {
    private Integer id;
    private String nama;
    private String kecamatan;
    private List<Dusun> daftarDusun2 = new ArrayList<>();

    public Kelurahan(Integer id, String nama, String kecamatan) {
        this.id = id;
        this.nama = nama;
        this.kecamatan = kecamatan;
    }
}
