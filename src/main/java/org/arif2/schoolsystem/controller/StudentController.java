package org.arif2.schoolsystem.controller;

import org.arif2.schoolsystem.model.SchoolClassModel;
import org.arif2.schoolsystem.model.SchoolHistoryModel;
import org.arif2.schoolsystem.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {
    private final List<StudentModel> STUDENT_MODEL;

    //Constructor
    public StudentController(List<StudentModel> student) {
        this.STUDENT_MODEL = student;
        List<SchoolHistoryModel> arifSchoolHistory = new ArrayList<>();
        arifSchoolHistory.add(
                new SchoolHistoryModel(11,"SDN 07 Kotagajah","KotaGajah","Lampung",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas1",LocalDate.of(2010, 7, 18),LocalDate.of(2011,6,28),"Ibu Eni"),
                                new SchoolClassModel(2,"Kelas2",LocalDate.of(2011, 7, 18),LocalDate.of(2012,6,28),"Ibu Eni"),
                                new SchoolClassModel(3,"Kelas3",LocalDate.of(2012, 7, 18),LocalDate.of(2013,6,28),"Ibu Eni"),
                                new SchoolClassModel(4,"Kelas4",LocalDate.of(2013, 7, 18),LocalDate.of(2014,6,28),"Ibu Eni"),
                                new SchoolClassModel(5,"Kelas5",LocalDate.of(2014, 7, 18),LocalDate.of(2015,6,28),"Ibu Eni"),
                                new SchoolClassModel(6,"Kelas6",LocalDate.of(2015, 7, 18),LocalDate.of(2016,6,28),"Ibu Eni")
                        )
                )
        );
        arifSchoolHistory.add(
                new SchoolHistoryModel(111,"SMPN 02 Kotagajah","KotaGajah","Lampung",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas7",LocalDate.of(2016,6,17),LocalDate.of(2017,7,18),"Pak Dahlan"),
                                new SchoolClassModel(2,"Kelas8",LocalDate.of(2017,6,17),LocalDate.of(2018,7,18),"Pak Dahlan"),
                                new SchoolClassModel(3,"Kelas9",LocalDate.of(2018,6,17),LocalDate.of(2019,7,18),"Pak Dahlan")
                        )
                )
        );
        arifSchoolHistory.add(
                new SchoolHistoryModel(1111,"SMK 05 Kotagajah","KotaGajah","Lampung",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas10",LocalDate.of(2019,7,18),LocalDate.of(2020,6,17),"Bu Jeni"),
                                new SchoolClassModel(2,"Kelas11",LocalDate.of(2020,7,18),LocalDate.of(2021,6,17),"Bu Jeni"),
                                new SchoolClassModel(3,"Kelas12",LocalDate.of(2021,7,18),LocalDate.of(2022,6,17),"Bu Jeni")
                        )
                )
        );

        List<SchoolHistoryModel> sabil = new ArrayList<>();
        sabil.add(
                new SchoolHistoryModel(11,"SDN 02 Pandaan", "Pandaan","Surabaya",
                     Arrays.asList(
                             new SchoolClassModel(1,"Kelas1",LocalDate.of(2009,6,16),LocalDate.of(2010,7,17),"Pak Heru"),
                             new SchoolClassModel(2,"Kelas2",LocalDate.of(2010,6,16),LocalDate.of(2011,7,17),"Pak Heru"),
                             new SchoolClassModel(3,"Kelas3",LocalDate.of(2011,6,16),LocalDate.of(2012,7,17),"Pak Heru"),
                             new SchoolClassModel(4,"Kelas4",LocalDate.of(2012,6,16),LocalDate.of(2013,7,17),"Pak Heru"),
                             new SchoolClassModel(5,"Kelas5",LocalDate.of(2013,6,16),LocalDate.of(2014,7,17),"Pak Heru"),
                             new SchoolClassModel(6,"Kelas6",LocalDate.of(2014,6,16),LocalDate.of(2015,7,17),"Pak Heru")
                     )
                )
        );

        sabil.add(
                new SchoolHistoryModel(111,"SMPN 02 Pandaan","Pandaan","Surabaya",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas7",LocalDate.of(2015,7,17),LocalDate.of(2016,8,18),"Bu Sumirna"),
                                new SchoolClassModel(2,"Kelas8",LocalDate.of(2016,7,17),LocalDate.of(2017,8,18),"Bu Sumirna"),
                                new SchoolClassModel(3,"Kelas9",LocalDate.of(2017,7,17),LocalDate.of(2018,8,18),"Bu Sumirna")
                        )
                )
        );

        sabil.add(
                new SchoolHistoryModel(1111,"SMK 03 Pandaan","Pandaan","Surabaya",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas10",LocalDate.of(2018,8,18),LocalDate.of(2019,9,19),"Pak Budi"),
                                new SchoolClassModel(2,"Kelas11",LocalDate.of(2019,8,18),LocalDate.of(2020,9,19),"Pak Budi"),
                                new SchoolClassModel(3,"Kelas12",LocalDate.of(2020,8,18),LocalDate.of(2021,9,19),"Pak Budi")
                        )
                )
        );

        List<SchoolHistoryModel> dani = new ArrayList<>();
        dani.add(
                new SchoolHistoryModel(11,"SDN 03 Ciamis", "Ciparakan","Ciamis",
                     Arrays.asList(
                       new SchoolClassModel(1,"Kelas1",LocalDate.of(2009,6,17),LocalDate.of(2010,7,17),"Bu Ratna"),
                       new SchoolClassModel(2,"Kelas2",LocalDate.of(2010,6,17),LocalDate.of(2011,7,17),"Bu Ratna"),
                       new SchoolClassModel(3,"Kelas3",LocalDate.of(2011,6,17),LocalDate.of(2012,7,17),"Bu Ratna"),
                       new SchoolClassModel(3,"Kelas4",LocalDate.of(2012,6,17),LocalDate.of(2013,7,17),"Bu Ratna"),
                       new SchoolClassModel(3,"Kelas5",LocalDate.of(2013,6,17),LocalDate.of(2014,7,17),"Bu Ratna"),
                       new SchoolClassModel(3,"Kelas6",LocalDate.of(2014,6,17),LocalDate.of(2015,7,17),"Bu Ratna")
                     )
                )
        );

        dani.add(
                new SchoolHistoryModel(111,"SMPN 04 Ciparakan","Ciparakan","Ciamis",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas7",LocalDate.of(2016,7,17),LocalDate.of(2017,8,18),"Pak Adi"),
                                new SchoolClassModel(2,"Kelas8",LocalDate.of(2017,7,17),LocalDate.of(2018,8,18),"Pak Adi"),
                                new SchoolClassModel(3,"Kelas9",LocalDate.of(2018,7,17),LocalDate.of(2019,8,18),"Pak Adi")
                        )
                )
        );

        dani.add(
                new SchoolHistoryModel(1111,"SMAN 01 Ciparakan","Ciparakan","Ciamis",
                   Arrays.asList(
                           new SchoolClassModel(1,"Kelas10",LocalDate.of(2020,8,18),LocalDate.of(2021,9,19),"Pak Andre"),
                           new SchoolClassModel(2,"Kelas11",LocalDate.of(2021,8,18),LocalDate.of(2022,9,19),"Pak Andre"),
                           new SchoolClassModel(3,"Kelas12",LocalDate.of(2022,8,18),LocalDate.of(2023,9,19),"Pak Andre")
                   )
                )
        );

        List<SchoolHistoryModel> dimas = new ArrayList<>();
        dimas.add(
                new SchoolHistoryModel(11,"SDN 05 Ciamis", "Ciparakan","Ciamis",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas1",LocalDate.of(2009,6,17),LocalDate.of(2010,7,17),"Bu Erika"),
                                new SchoolClassModel(2,"Kelas2",LocalDate.of(2010,6,17),LocalDate.of(2011,7,17),"Bu Erika"),
                                new SchoolClassModel(3,"Kelas3",LocalDate.of(2011,6,17),LocalDate.of(2012,7,17),"Bu Erika"),
                                new SchoolClassModel(3,"Kelas4",LocalDate.of(2012,6,17),LocalDate.of(2013,7,17),"Bu Erika"),
                                new SchoolClassModel(3,"Kelas5",LocalDate.of(2013,6,17),LocalDate.of(2014,7,17),"Bu Erika"),
                                new SchoolClassModel(3,"Kelas6",LocalDate.of(2014,6,17),LocalDate.of(2015,7,17),"Bu Erika")
                        )
                )
        );

        dimas.add(
                new SchoolHistoryModel(111,"SMPN 04 Ciparakan","Ciparakan","Ciamis",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas7",LocalDate.of(2016,7,17),LocalDate.of(2017,8,18),"Pak Kiki"),
                                new SchoolClassModel(2,"Kelas8",LocalDate.of(2017,7,17),LocalDate.of(2018,8,18),"Pak Kiki"),
                                new SchoolClassModel(3,"Kelas9",LocalDate.of(2018,7,17),LocalDate.of(2019,8,18),"Pak Kiki")
                        )
                )
        );

        dimas.add(
                new SchoolHistoryModel(1111,"SMAN 03 Ciparakan","Ciparakan","Ciamis",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas10",LocalDate.of(2020,8,18),LocalDate.of(2021,9,19),"Pak Dirga"),
                                new SchoolClassModel(2,"Kelas11",LocalDate.of(2021,8,18),LocalDate.of(2022,9,19),"Pak Dirga"),
                                new SchoolClassModel(3,"Kelas12",LocalDate.of(2022,8,18),LocalDate.of(2023,9,19),"Pak Dirga")
                        )
                )
        );

        List<SchoolHistoryModel> dika = new ArrayList<>();
        dika.add(
                new SchoolHistoryModel(11,"SDN 03 Pandaan", "Pandaan","Surabaya",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas1",LocalDate.of(2009,6,16),LocalDate.of(2010,7,17),"Pak Herman"),
                                new SchoolClassModel(2,"Kelas2",LocalDate.of(2010,6,16),LocalDate.of(2011,7,17),"Pak Herman"),
                                new SchoolClassModel(3,"Kelas3",LocalDate.of(2011,6,16),LocalDate.of(2012,7,17),"Pak Herman"),
                                new SchoolClassModel(4,"Kelas4",LocalDate.of(2012,6,16),LocalDate.of(2013,7,17),"Pak Herman"),
                                new SchoolClassModel(5,"Kelas5",LocalDate.of(2013,6,16),LocalDate.of(2014,7,17),"Pak Herman"),
                                new SchoolClassModel(6,"Kelas6",LocalDate.of(2014,6,16),LocalDate.of(2015,7,17),"Pak Herman")
                        )
                )
        );

        dika.add(
                new SchoolHistoryModel(111,"SMPN 07 Pandaan","Pandaan","Surabaya",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas7",LocalDate.of(2015,7,17),LocalDate.of(2016,8,18),"Bu Ratna"),
                                new SchoolClassModel(2,"Kelas8",LocalDate.of(2016,7,17),LocalDate.of(2017,8,18),"Bu Ratna"),
                                new SchoolClassModel(3,"Kelas9",LocalDate.of(2017,7,17),LocalDate.of(2018,8,18),"Bu Ratna")
                        )
                )
        );

        dika.add(
                new SchoolHistoryModel(1111,"SMK 09 Pandaan","Pandaan","Surabaya",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas10",LocalDate.of(2018,8,18),LocalDate.of(2019,9,19),"Pak Edi"),
                                new SchoolClassModel(2,"Kelas11",LocalDate.of(2019,8,18),LocalDate.of(2020,9,19),"Pak Edi"),
                                new SchoolClassModel(3,"Kelas12",LocalDate.of(2020,8,18),LocalDate.of(2021,9,19),"Pak Edi")
                        )
                )
        );

        List<SchoolHistoryModel> aldi = new ArrayList<>();
        aldi.add(
                new SchoolHistoryModel(11,"SDN 02 Kotagajah","KotaGajah","Lampung",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas1",LocalDate.of(2010, 7, 18),LocalDate.of(2011,6,28),"Ibu Tuminah"),
                                new SchoolClassModel(2,"Kelas2",LocalDate.of(2011, 7, 18),LocalDate.of(2012,6,28),"Ibu Tuminah"),
                                new SchoolClassModel(3,"Kelas3",LocalDate.of(2012, 7, 18),LocalDate.of(2013,6,28),"Ibu Tuminah"),
                                new SchoolClassModel(4,"Kelas4",LocalDate.of(2013, 7, 18),LocalDate.of(2014,6,28),"Ibu Tuminah"),
                                new SchoolClassModel(5,"Kelas5",LocalDate.of(2014, 7, 18),LocalDate.of(2015,6,28),"Ibu Tuminah"),
                                new SchoolClassModel(6,"Kelas6",LocalDate.of(2015, 7, 18),LocalDate.of(2016,6,28),"Ibu Tuminah")
                        )
                )
        );
        aldi.add(
                new SchoolHistoryModel(111,"SMPN 08 Kotagajah","KotaGajah","Lampung",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas7",LocalDate.of(2016,6,17),LocalDate.of(2017,7,18),"Pak Eko"),
                                new SchoolClassModel(2,"Kelas8",LocalDate.of(2017,6,17),LocalDate.of(2018,7,18),"Pak Eko"),
                                new SchoolClassModel(3,"Kelas9",LocalDate.of(2018,6,17),LocalDate.of(2019,7,18),"Pak Eko")
                        )
                )
        );
        aldi.add(
                new SchoolHistoryModel(1111,"SMK 01 Kotagajah","KotaGajah","Lampung",
                        Arrays.asList(
                                new SchoolClassModel(1,"Kelas10",LocalDate.of(2019,7,18),LocalDate.of(2020,6,17),"Bu Reni"),
                                new SchoolClassModel(2,"Kelas11",LocalDate.of(2020,7,18),LocalDate.of(2021,6,17),"Bu Reni"),
                                new SchoolClassModel(3,"Kelas12",LocalDate.of(2021,7,18),LocalDate.of(2022,6,17),"Bu Reni")
                        )
                )
        );

        StudentModel daftar = new StudentModel(1,2241001,"Arif","Lampung");
        daftar.setSchoolHistory(arifSchoolHistory);

        StudentModel daftar2 = new StudentModel(2,2241002,"Sabil","Surabaya");
        daftar2.setSchoolHistory(sabil);

        StudentModel daftar3 = new StudentModel(3,2241003,"Dani","Ciamis");
        daftar3.setSchoolHistory(dani);

        StudentModel daftar4 = new StudentModel(4,2241004,"Dimas","Ciamis");
        daftar4.setSchoolHistory(dimas);

        StudentModel daftar5 = new StudentModel(5,2241005,"Dika","Surabaya");
        daftar5.setSchoolHistory(dika);

        StudentModel daftar6 = new StudentModel(6,2241006,"Aldi","Lampung");
        daftar6.setSchoolHistory(aldi);

        this.STUDENT_MODEL.add(daftar);
        this.STUDENT_MODEL.add(daftar2);
        this.STUDENT_MODEL.add(daftar3);
        this.STUDENT_MODEL.add(daftar4);
        this.STUDENT_MODEL.add(daftar5);
        this.STUDENT_MODEL.add(daftar6);
        this.STUDENT_MODEL.add(new StudentModel(7,2241007,"Diko","Palembang"));
        this.STUDENT_MODEL.add(new StudentModel(8,2241008,"Anggi","Riau"));
        this.STUDENT_MODEL.add(new StudentModel(9,2241009,"Nanda","Banten"));
        this.STUDENT_MODEL.add(new StudentModel(10,2241010,"Nando","Pontianak"));
    }
    @GetMapping
    public ModelAndView getList() {
        ModelAndView mv = new ModelAndView("student/student");
        mv.addObject("student", STUDENT_MODEL);
        return mv;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView getDetail(@PathVariable int id) {
       ModelAndView mav = new ModelAndView("student/student-details");
        Optional<StudentModel> detail = STUDENT_MODEL.stream().filter(x -> x.getId() == id).findFirst();
        if (detail.isPresent()) {
            mav.addObject("student", detail.get());
        } else {
            return new ModelAndView("redirect:/menu");
        }

        return mav;
    }

    @GetMapping("/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("student/add");
        StudentModel student = new StudentModel();

        List<SchoolHistoryModel> schoolHistory = new ArrayList<>();

        //SD Class
        List<SchoolClassModel> sdClass = new ArrayList<>();
        sdClass.add(new SchoolClassModel(1,"kelas1",null,null,""));
        sdClass.add(new SchoolClassModel(2,"kelas2",null,null,""));
        sdClass.add(new SchoolClassModel(3,"kelas3",null,null,""));
        sdClass.add(new SchoolClassModel(4,"kelas4",null,null,""));
        sdClass.add(new SchoolClassModel(5,"kelas5",null,null,""));
        sdClass.add(new SchoolClassModel(6,"kelas6",null,null,""));

        //SD
        SchoolHistoryModel addHistory = new SchoolHistoryModel(0,"SD","","",sdClass);
        //Add School History
        schoolHistory.add(addHistory);

        //SMP
        List<SchoolClassModel> smpClass = new ArrayList<>();
        smpClass.add(new SchoolClassModel(1,"Kelas7",null,null,""));
        smpClass.add(new SchoolClassModel(2,"Kelas8",null,null,""));
        smpClass.add(new SchoolClassModel(3,"Kelas9",null,null,""));

        //SMP
        SchoolHistoryModel smpHistory = new SchoolHistoryModel(0, "SMP","","",smpClass);
        //Add School History
        schoolHistory.add(smpHistory);

        //SMA Class
        List<SchoolClassModel> smaClass = new ArrayList<>();
        smaClass.add(new SchoolClassModel(1,"Kelas10",null,null,""));
        smaClass.add(new SchoolClassModel(2,"Kelas11",null,null,""));
        smaClass.add(new SchoolClassModel(3,"Kelas12",null,null,""));

        //SMA
        SchoolHistoryModel smaHistory = new SchoolHistoryModel(0, "SMA","","",smaClass);
        //Add School History
        schoolHistory.add(smaHistory);

        //Add to Student
        student.setSchoolHistory(schoolHistory);

        mav.addObject("student",student);
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("student")StudentModel student) {
        STUDENT_MODEL.add(student);
        return new ModelAndView("redirect:/student");
    }
}
