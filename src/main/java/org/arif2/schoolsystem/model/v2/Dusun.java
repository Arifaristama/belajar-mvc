package org.arif2.schoolsystem.model.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dusun {
    private Integer id;
    private String name;
    private Kelurahan kelurahan;
    private List<RW> daftarRW2 = new ArrayList<>();

    public Dusun(Integer id, String name, Kelurahan kelurahan) {
        this.id = id;
        this.name = name;
        this.kelurahan = kelurahan;
    }
}
