package org.arif2.schoolsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolClassModel {
    private int id;
    private String schoolCLass;
    private LocalDate start;
    private LocalDate end;
    private String teacher;
}
