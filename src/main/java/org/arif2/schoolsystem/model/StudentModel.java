package org.arif2.schoolsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
    private int id;
    private int nis;
    private String nama;
    private String alamat;

    private List<SchoolHistoryModel> schoolHistory = new ArrayList<>();

    public StudentModel(int id, int nis, String nama, String alamat) {
        this.id = id;
        this.nis = nis;
        this.nama = nama;
        this.alamat = alamat;
    }
}
