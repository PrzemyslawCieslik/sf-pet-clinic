package przemek.springframework.sfpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
   public String VetList(){
       return "vets/index.html";
   }
}
