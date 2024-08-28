package org.arif2.schoolsystem.model.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Dusun {
    private String id;
    private String name;
    private Kelurahan kelurahan;
    private List<RW> daftarRW2 = new ArrayList<>();

    public Dusun(String id, String name, Kelurahan kelurahan) {
        this.id = id;
        this.name = name;
        this.kelurahan = kelurahan;
    }

    public Dusun(String id, String name, List<RW> daftarRW2) {
        this.id = id;
        this.name = name;
        this.daftarRW2 = daftarRW2;
    }

    public Dusun(String name, Kelurahan kelurahan) {
        this.name = name;
        this.kelurahan = kelurahan;
    }

    public Dusun() {
        this.id = UUID.randomUUID().toString();
    }
}
