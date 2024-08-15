package org.arif2.schoolsystem.model.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RT {
    private Integer id;
    private String name;
    private String nameRt;
    private RW rw;
    private Dusun dusun;
    private Kelurahan kelurahan;
    List<Warga> daftarWarga2 = new ArrayList<>();

    public RT(Integer id, String name, String nameRt, RW rw, Dusun dusun, Kelurahan kelurahan) {
        this.id = id;
        this.name = name;
        this.nameRt = nameRt;
        this.rw = rw;
        this.dusun = dusun;
        this.kelurahan = kelurahan;
    }

    public RT(Integer id, String name, String nameRt, List<Warga> daftarWarga2) {
        this.id = id;
        this.name = name;
        this.nameRt = nameRt;
        this.daftarWarga2 = daftarWarga2;
    }
}
