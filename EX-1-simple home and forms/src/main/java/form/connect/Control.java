package form.connect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
    @RequestMapping("/login")
    public String registerform(@ModelAttribute("frm")Forms frm)
    {
        return "registration_form.html";
    }
   @RequestMapping("/registersucc")
   public String registersucc(@ModelAttribute("frm")Forms frm)
   {
    return "registration_succ.html";
   }

}