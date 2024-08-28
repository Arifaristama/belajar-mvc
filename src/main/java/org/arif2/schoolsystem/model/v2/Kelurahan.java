package org.arif2.schoolsystem.model.v2;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Kelurahan {
    private String id;
    private String nama;
    private String kecamatan;
    private List<Dusun> daftarDusun2 = new ArrayList<>();

    public Kelurahan(String id, String nama, String kecamatan) {
        this.id = id;
        this.nama = nama;
        this.kecamatan = kecamatan;
    }

    public Kelurahan(String id, String nama, List<Dusun> daftarDusun2) {
        this.id = id;
        this.nama = nama;
        this.daftarDusun2 = daftarDusun2;
    }

    public Kelurahan(String nama, String kecamatan) {
        this.nama = nama;
        this.kecamatan = kecamatan;
    }

    public Kelurahan() {
        this.id = UUID.randomUUID().toString();
    }
}
