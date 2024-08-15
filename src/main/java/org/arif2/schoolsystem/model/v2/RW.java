package org.arif2.schoolsystem.model.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RW {
    private Integer id;
    private String name;
    private String nameRW;
    private Dusun dusun;
    private Kelurahan kelurahan;
    private List<RT> daftarRT2 = new ArrayList<>();

    public RW(Integer id, String name, String nameRW, Dusun dusunV2, Kelurahan kelurahan) {
        this.id = id;
        this.name = name;
        this.nameRW = nameRW;
        this.dusun = dusunV2;
        this.kelurahan = kelurahan;
    }

    public RW(Integer id, String name, String nameRW, List<RT> daftarRT2) {
        this.id = id;
        this.name = name;
        this.nameRW = nameRW;
        this.daftarRT2 = daftarRT2;
    }
}
