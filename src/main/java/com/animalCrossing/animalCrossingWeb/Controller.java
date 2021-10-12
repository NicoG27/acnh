package com.animalCrossing.animalCrossingWeb;

import com.animalCrossing.animalCrossingWeb.Entity.Date;
import com.animalCrossing.animalCrossingWeb.Repositories.TierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    TierRepository tierRepository;
    @RequestMapping("/")
    public String index(Model model) {

        LocalDate date = LocalDate.now();
        model.addAttribute("tiere", tierRepository.findByMonatAndTime(date.getMonthValue()));
        model.addAttribute("date", LocalDate.now().toString());
        return "start";
    }

    @RequestMapping(value = "/", method=RequestMethod.POST)
    public String processForm(@ModelAttribute Date date, Model model) {
        System.out.println(date.getTime());
        System.out.println(date.getSelect());
        LocalDate localDate = LocalDate.parse(date.getDate());
        model.addAttribute("tiere", tierRepository.findByMonatAndTime(localDate.getMonthValue()));
        model.addAttribute("date", localDate.toString());

        return "start";
    }
}
