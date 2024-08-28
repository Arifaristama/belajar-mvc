package org.arif2.schoolsystem.controller.kelurahan;

import org.arif2.schoolsystem.model.kelurahan.*;
import org.arif2.schoolsystem.model.v2.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/kelurahan2")
public class KelurahanControllerV2 {
    public static List<Kelurahan> kelurahanList;

    public KelurahanControllerV2() {
        this.kelurahanList = new ArrayList<>();

        // Add sukahurip to list
        // kelurahanList.add(sukahurip);

        // Daftar Kelurahan
        Kelurahan sukahurip = new Kelurahan(UUID.randomUUID().toString(), "Sukarhurip","Pamarican");
        kelurahanList.add(sukahurip);

//        Kelurahan kertahayu = new Kelurahan(UUID.randomUUID().hashCode(),"Kertahayu", "Pamarican");
//        kelurahanList.add(kertahayu);
//
//        Kelurahan banjarsari = new Kelurahan(UUID.randomUUID().hashCode(),"Banjar Sari", "Pamarican");
//        kelurahanList.add(banjarsari);

        Dusun dusun1 = new Dusun(UUID.randomUUID().toString(), "Dusun 01",sukahurip);
        List<RW> rwList = new ArrayList<>();

        //Menambahkan rw ke list
        RW rw01 = new RW(UUID.randomUUID().toString(),"RW 01","Budiono",dusun1,sukahurip);

        //Inisiasi objek
        List<RT> rtList = new ArrayList<>();
        RT rt01 = new RT(UUID.randomUUID().toString(),"RT 01","Dimas",rw01,dusun1,sukahurip);

        //Daftar warga
        List<Warga> wargaList = new ArrayList<>();
        Warga warga01 = new Warga(UUID.randomUUID().toString(),1123,"Dimas","Laki-Laki", 20);
        wargaList.add(warga01);

//        Warga warga02 = new Warga(UUID.randomUUID().hashCode(),1124,"Dika","Laki-Laki",20);
//        wargaList.add(warga02);

        rt01.setDaftarWarga2(wargaList);
        rtList.add(rt01);

        RT rt03 = new RT(UUID.randomUUID().toString(),"RT 03","Anton", rw01, dusun1,sukahurip);
        rtList.add(rt03);

        //RW 01 Menambah daftar RT
        rw01.setDaftarRT2(rtList);
        //RW 01 Menambah ke daftar RW
        rwList.add(rw01);

        RW rw02 = new RW(UUID.randomUUID().toString(),"RW 02", "Galih", dusun1, sukahurip);
        rwList.add(rw02);

//        RW rw03 = new RW(UUID.randomUUID().hashCode(),"RW 03","Malik", dusun1, sukahurip);
//        rwList.add(rw03);
//
//        RW rw04 = new RW(UUID.randomUUID().hashCode(),"RW 04","Junaidi", dusun1, sukahurip);
//        rwList.add(rw04);

        //Set Dusun Rw
        dusun1.setDaftarRW2(rwList);

        //Daftar dusun
        List<Dusun> dusunList = new ArrayList<>();
        dusunList.add(dusun1);

        //Add daftar dusun ke Objek sukahurip
        sukahurip.setDaftarDusun2(dusunList);

    }

    @GetMapping()
    public ModelAndView index () {
        ModelAndView mv = new ModelAndView("kelurahan2/index");
        mv.addObject("lurah", this.kelurahanList);
        return mv;
    }

    @GetMapping("/kelurahan2/detail/{id}")
    private ModelAndView kelurahanDetail (@PathVariable("id") String id) {
        ModelAndView mv = new ModelAndView("kelurahan2/kelurahan-detail");

        Optional<Kelurahan> kelurahan = kelurahanList.stream().filter(x -> x.getId().equals(id)).findFirst();
        if (kelurahan.isPresent()) {
            mv.addObject("lurah",kelurahan.get());
            return mv;
        } else {
            return new ModelAndView("redirect:/kelurahan2");
        }
    }

    @GetMapping("/kelurahan2/detail/{kelurahanId}/dusun/{dusunId}")
    public ModelAndView dusun(@PathVariable("kelurahanId") String kelurahanId,
                              @PathVariable("dusunId") String dusunId){
        ModelAndView mav = new ModelAndView("kelurahan2/dusun-detail");

        Optional<Kelurahan> result = kelurahanList.stream().filter(x -> x.getId().equals(kelurahanId)).findFirst();
        if (result.isPresent()) {
            Dusun dusun = result.get().getDaftarDusun2().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            mav.addObject("kelurahan", result.get());
            mav.addObject("dusun2", dusun);
            return mav;
        } else {
            return new ModelAndView("redirect:/kelurahan2");
        }
    }

    @GetMapping("/kelurahan2/detail/{kelurahanId}/dusun/{dusunId}/rw/{rwId}")
    private ModelAndView rwDetail (@PathVariable("kelurahanId") String id,
                                   @PathVariable("dusunId") String dusunId,
                                   @PathVariable("rwId") String rwId) {
        ModelAndView mv = new ModelAndView("kelurahan2/rw-detail");

        Optional<Kelurahan> kelurahan = kelurahanList.stream().filter(x -> x.getId().equals(id)).findFirst();
        if (kelurahan.isPresent()) {
            Dusun dusun = kelurahan.get().getDaftarDusun2().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            RW rw = dusun.getDaftarRW2().stream().filter(x -> x.getId().equals(rwId)).findFirst().get();
            mv.addObject("kelurahan", kelurahan.get());
            mv.addObject("dusun", dusun);
            mv.addObject("rw2",rw);
            return mv;
        } else {
            return new ModelAndView("redirect:/kelurahan2");
        }
    }

    @GetMapping("/kelurahan2/detail/{kelurahanId}/dusun/{dusunId}/rw/{rwId}/rt/{rtId}")
    private ModelAndView rtDetail (@PathVariable("kelurahanId") String kelurahanId,
                                   @PathVariable("dusunId") String dusunId,
                                   @PathVariable("rwId") String rwId,
                                   @PathVariable("rtId") String rtId) {

        ModelAndView mv = new ModelAndView("kelurahan2/rt-detail");

        Optional<Kelurahan> kelurahan = kelurahanList.stream().filter(x -> x.getId().equals(kelurahanId)).findFirst();
        if (kelurahan.isPresent()) {
            Dusun dusun = kelurahan.get().getDaftarDusun2().stream().filter(x -> x.getId().equals(dusunId)).findFirst().get();
            RW rw = dusun.getDaftarRW2().stream().filter(x -> x.getId().equals(rwId)).findFirst().get();
            RT rt = rw.getDaftarRT2().stream().filter(x -> x.getId().equals(rtId)).findFirst().get();
            mv.addObject("kelurahan", kelurahan.get());
            mv.addObject("dusun", dusun);
            mv.addObject("rw2", rw);
            mv.addObject("rt2",rt);
            return mv;
        } else {
            return new ModelAndView("redirect:/kelurahan2");
        }
    }

    @RequestMapping("/add")
    private ModelAndView add() {
        ModelAndView mv = new ModelAndView("kelurahan2/add");
        Kelurahan kelurahan = new Kelurahan();

        List<Dusun> dusunList = new ArrayList<>();

        ArrayList<Warga> wargaList = new ArrayList<>();
        wargaList.add(new Warga("",0,"","",0));

        ArrayList<RT> rtList = new ArrayList<>();
        rtList.add(new RT("","","", wargaList));

        ArrayList<RW> rwList = new ArrayList<>();
        rwList.add(new RW("","","", rtList));

        Dusun dusun = new Dusun("","", kelurahan, rwList);
        dusunList.add(dusun);

        kelurahan.setDaftarDusun2(dusunList);

        mv.addObject("kelurahan", kelurahan);

        return mv;
    }

    @RequestMapping("/add/v2")
    private ModelAndView addv2() {
        ModelAndView mav = new ModelAndView("kelurahan2/addv2");
        Kelurahan kelurahan = new Kelurahan();

        List<Dusun> dusunList = new ArrayList<>();

        ArrayList<Warga> wargaList = new ArrayList<>();
        wargaList.add(new Warga("",0,"","",0));

        ArrayList<RT> rtList = new ArrayList<>();
        rtList.add(new RT("","","", wargaList));

        ArrayList<RW> rwList = new ArrayList<>();
        rwList.add(new RW("","","", rtList));

        Dusun dusun = new Dusun("","", kelurahan, rwList);
        dusunList.add(dusun);

        kelurahan.setDaftarDusun2(dusunList);

        mav.addObject("kelurahan", kelurahan);

        return mav;
    }

    @PostMapping("/save")
    private ModelAndView save (@ModelAttribute Kelurahan kelurahan) {
        kelurahanList.add(kelurahan);

        return new ModelAndView("redirect:/kelurahan2");

    }

    @GetMapping("/edit/{id}")
    private ModelAndView edit(@PathVariable("id") Integer id) {
        ModelAndView mv = new ModelAndView("kelurahan2/edit");

        Optional<Kelurahan> kelurahanOpsi = kelurahanList.stream().filter(x -> x.getId().equals(id)).findFirst();
        if (kelurahanOpsi.isPresent()) {
            mv.addObject("kelurahan", kelurahanOpsi.get());
            return mv;
        } else {
            return new ModelAndView("redirect:/kelurahan2");
        }
    }
}
