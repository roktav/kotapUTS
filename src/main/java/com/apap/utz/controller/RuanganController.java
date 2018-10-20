package com.apap.utz.controller;

import com.apap.utz.model.RuanganModel;
import com.apap.utz.service.RuanganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RuanganController {
    @Autowired
    private RuanganService ruanganService;

    @RequestMapping(value = "/ruangan/viewall",  method = RequestMethod.GET)
    public String viewallRuangan (Model model) {
        model.addAttribute("listRuangan", ruanganService.getRuanganList());
        return "viewall-ruangan";
    }

    @RequestMapping(value = "/ruangan/view", method = RequestMethod.GET)
    public String viewRuangan (@RequestParam("id") int id, Model model) {
        RuanganModel ruangan = ruanganService.getRuanganbyId(id);
        model.addAttribute("ruangan", ruangan);
        return "detail-ruangan";
    }

    @RequestMapping(value = "/ruangan/add", method = RequestMethod.GET)
    private String addRuangan (Model model) {
        model.addAttribute("ruangan", new RuanganModel());
        return "add-ruangan";
    }

    @RequestMapping(value = "/ruangan/add", method = RequestMethod.POST)
    private String addRuanganSukses (@ModelAttribute RuanganModel ruangan) {
        ruanganService.addRuangan(ruangan);
        return "add-ruangan-sukses";
    }

    @RequestMapping(value = "/ruangan/update", method = RequestMethod.GET)
    private String updateRuangan (@RequestParam(value = "id") int id, Model model) {
        RuanganModel ruangan = ruanganService.getRuanganbyId(id);
        model.addAttribute("ruangan", ruangan);
        return "update-ruangan";
    }
}
