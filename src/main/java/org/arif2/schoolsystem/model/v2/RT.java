package org.arif2.schoolsystem.model.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class RT {
    private String  id;
    private String name;
    private String nameRt;
    private RW rw;
    private Dusun dusun;
    private Kelurahan kelurahan;
    List<Warga> daftarWarga2 = new ArrayList<>();

    public RT(String id, String name, String nameRt, RW rw, Dusun dusun, Kelurahan kelurahan) {
        this.id = id;
        this.name = name;
        this.nameRt = nameRt;
        this.rw = rw;
        this.dusun = dusun;
        this.kelurahan = kelurahan;
    }

    public RT(String id, String name, String nameRt, List<Warga> daftarWarga2) {
        this.id = id;
        this.name = name;
        this.nameRt = nameRt;
        this.daftarWarga2 = daftarWarga2;
    }

    public RT() {
        this.id = UUID.randomUUID().toString();
    }

    public RT(String name, String nameRt) {
        this.name = name;
        this.nameRt = nameRt;

    }
}
