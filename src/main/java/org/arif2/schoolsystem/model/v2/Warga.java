package org.arif2.schoolsystem.model.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Warga {
    private Integer id;
    private Integer nik;
    private String namaWarga;
    private String jenisKelamin;
    private Integer age;

    public Warga(Integer id, Integer nik, String namaWarga, String jenisKelamin, Integer age) {
        this.id = id;
        this.nik = nik;
        this.namaWarga = namaWarga;
        this.jenisKelamin = jenisKelamin;
        this.age = age;
    }
}
