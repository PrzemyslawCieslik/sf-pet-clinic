package przemek.springframework.sfpetclinic.controllers.errorsControllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotImplemented {

    @RequestMapping({"/owners/find", "/find", "/oups"})
    public String findOwners(){
        return "errors/notimpl.html";
    }
}


