package przemek.springframework.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import przemek.springframework.sfpetclinic.model.Vet;
import przemek.springframework.sfpetclinic.services.VetService;

import java.util.Set;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
   public String VetList(Model model){

        model.addAttribute("vets", vetService.findAll());

       return "vets/index.html";
   }

   @GetMapping("/api/vets")
   public @ResponseBody Set<Vet> getVetsJson(){

        return vetService.findAll();
   }
}
