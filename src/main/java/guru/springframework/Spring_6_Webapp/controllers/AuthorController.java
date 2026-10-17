package guru.springframework.Spring_6_Webapp.controllers;

import guru.springframework.Spring_6_Webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {



    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/author")
    public String getAuthor(Model model){

        model.addAttribute("author",authorService.findAll());

        return "author";

    }
}
