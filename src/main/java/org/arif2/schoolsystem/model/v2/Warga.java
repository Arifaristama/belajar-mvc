package org.arif2.schoolsystem.model.v2;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Warga {
    private String id;
    private Integer nik;
    private String namaWarga;
    private String jenisKelamin;
    private Integer age;

    public Warga(String id, Integer nik, String namaWarga, String jenisKelamin, Integer age) {
        this.id = id;
        this.nik = nik;
        this.namaWarga = namaWarga;
        this.jenisKelamin = jenisKelamin;
        this.age = age;
    }
}
