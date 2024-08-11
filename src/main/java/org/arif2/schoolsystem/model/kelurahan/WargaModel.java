package org.arif2.schoolsystem.model.kelurahan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WargaModel {
    private Integer id;
    private String nama;
    private Integer nik;
    private Integer usia;
    private String jenisKelamin;

}
