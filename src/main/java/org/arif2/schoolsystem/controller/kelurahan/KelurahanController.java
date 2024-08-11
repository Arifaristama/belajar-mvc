package org.arif2.schoolsystem.controller.kelurahan;

import org.arif2.schoolsystem.model.kelurahan.*;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.*;

@Controller
@RequestMapping("/kelurahan")
public class KelurahanController {
    private final List<KelurahanModel> kelurahan =new ArrayList<>();

    public KelurahanController() {

        //Daftar Lurah
        KelurahanModel kelurahanModel = new KelurahanModel(1,"Sukahurip","Pamarican");
        KelurahanModel kelurahanModel2 = new KelurahanModel(2,"Kertahayu","Pamarican");
        KelurahanModel kelurahanModel3 = new KelurahanModel(3,"Banjar Sari","Pamarican");

        //Dusun
        DusunModel ciparakan = new DusunModel(1,"Ciparakan");
        DusunModel cikuya = new DusunModel(2,"Cikuya");
        DusunModel cigintung = new DusunModel(3,"Cigintung");

        //RW
        RWModel rw1 = new RWModel(1,"RW1","Sutrisno");
        RWModel rw2 = new RWModel(2,"RW2","Hamdani");
        RWModel rw3 = new RWModel(3,"RW3","Sarjono");

        //RT
        RTModel rt1 = new RTModel(1,"RT1", "Samsudin");
        RTModel rt2 = new RTModel(2,"RT2", "Suparjo");
        RTModel rt3 = new RTModel(3,"RT3", "Paijo");

        //Warga
        List<WargaModel> warga = new ArrayList<>();
        WargaModel marina = new WargaModel(1,"Marina",111,20,"Perempuan");
        WargaModel agus = new WargaModel(2,"agus",112,20,"Laki-Laki");
        WargaModel paijo = new WargaModel(3,"paijo",113,20,"Laki-Laki");
        WargaModel aminah = new WargaModel(4,"aminah",114,20,"Perempuan");
        WargaModel subaidah = new WargaModel(5,"subaidah",115,20,"Perempuan");

        warga.add(marina);
        warga.add(agus);
        warga.add(paijo);
        warga.add(aminah);
        warga.add(subaidah);

        rt1.setWargaModels(warga);

        //Detail Kelurahan
        List<DusunModel> sukahuripList = Arrays.asList(ciparakan, cikuya, cigintung);
        kelurahanModel.setDaftarDusun(sukahuripList);
        kelurahanModel2.setDaftarDusun(sukahuripList);
        kelurahanModel3.setDaftarDusun(sukahuripList);

        //Detail Dusun
        List<RWModel> ciparakanList = Arrays.asList(rw1,rw2,rw3);
        ciparakan.setRwModels(ciparakanList);
        cikuya.setRwModels(ciparakanList);
        cigintung.setRwModels(ciparakanList);

        //Detail RW
        List<RTModel> rw1List = Arrays.asList(rt1,rt2,rt3);
        rw1.setRtModels(rw1List);
        rw2.setRtModels(rw1List);
        rw3.setRtModels(rw1List);

        //Detail RT
//        WargaModel warga = new


        this.kelurahan.add(kelurahanModel);
        this.kelurahan.add(kelurahanModel2);
        this.kelurahan.add(kelurahanModel3);



    }

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mv = new ModelAndView("kelurahan/kelurahan/index");
        mv.addObject("kelurahan", this.kelurahan);
        return mv;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView getDetail(@PathVariable int id) {
        ModelAndView mv = new ModelAndView("kelurahan/kelurahan/kelurahan-detail");
        Optional<KelurahanModel> detail = kelurahan.stream().filter(k -> k.getId() == id).findFirst();
        if (detail.isPresent()) {
            mv.addObject("kelurahan",detail.get());
        } else {
            return new ModelAndView("redirect:/kelurahan");
        }
        return mv;
    }

    @GetMapping("/detail/dusun/{id}")
    public ModelAndView dusunDetail(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("kelurahan/dusun/detail");

        for (KelurahanModel kelurahan : this.kelurahan) {
            for (DusunModel dusun : kelurahan.getDaftarDusun()) {
                    if (dusun.getId().equals(id)) {
                        mv.addObject("kelurahan", kelurahan);
                        mv.addObject("dusun", dusun);
                        return mv;
                    }
            }
        }
        return new ModelAndView("redirect:/kelurahan");

    }

    @GetMapping("/detail/dusun/rw/{id}")
    public ModelAndView rwDetail(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("kelurahan/rw/detail");

        for (KelurahanModel kelurahan : this.kelurahan) {
            for (DusunModel dusun : kelurahan.getDaftarDusun()) {
                for(RWModel rw : dusun.getRwModels()) {
                    if (dusun.getId().equals(id)) {
                        mv.addObject("kelurahan", kelurahan);
                        mv.addObject("dusun", dusun);
                        mv.addObject("rw", rw);
                        return mv;
                    }
                }
            }
        }
        return new ModelAndView("redirect:/kelurahan");
    }

    @GetMapping("/detail/dusun/rw/rt/{id}")
    public ModelAndView rtDetail(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("kelurahan/rt/detail");

        for (KelurahanModel kelurahan : this.kelurahan) {
            for (DusunModel dusun : kelurahan.getDaftarDusun()) {
                for (RWModel rw : dusun.getRwModels()) {
                    for (RTModel rt : rw.getRtModels()) {
                        if (rt.getId().equals(id)) {
                            mv.addObject("kelurahan", kelurahan);
                            mv.addObject("dusun", dusun);
                            mv.addObject("rw", rw);
                            mv.addObject("rt", rt);
                            return mv;
                        }
                    }
                }
            }
        }
        return new ModelAndView("redirect:/kelurahan");
    }
}
