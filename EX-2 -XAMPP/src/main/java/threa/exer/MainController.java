package threa.exer;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller

public class MainController {
    @Autowired
    Repo r;    
    @GetMapping("")
    public String home()
    {
        return "index";
    }
    @GetMapping("/add_user")
    public String new1(Model model)
    {
        List<User> users=(List<User>)r.findAll();
        model.addAttribute("users", users);
        return "form";
    }
    @GetMapping("/users_home")
    public String newUser(Model model)
    { 
        model.addAttribute("user",new User());
        return "form";
    }
    @PostMapping("/save")
    public String addUser(User user,Model model)
    {
        r.save(user);
        return  "form";
    }
    @GetMapping("/update/user{id}")
    public String updateUser(@PathVariable int id,Model model)
    {
        Optional<User> user=r.findById(id);
        model.addAttribute("user",user.get());
        return "redirect:/users_home";
    }
    @GetMapping("/delete/user{id}")
    public String deleteUser(@PathVariable int id)
    {
        r.deleteById(id);
        return "redirect:/users_home";
    }
}