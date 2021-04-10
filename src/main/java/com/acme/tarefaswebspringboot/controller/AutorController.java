package com.acme.tarefaswebspringboot.controller;

import com.acme.tarefaswebspringboot.model.Autor;
import com.acme.tarefaswebspringboot.util.Constants;
import com.fasterxml.jackson.databind.util.JSONPObject;

import lombok.val;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class AutorController {

    RestTemplate rest = new RestTemplate();

    @GetMapping
    String index(Model model) {
        List<Autor> autores = rest.getForObject(Constants.URL_API + "/users", List.class);
    
        model.addAttribute("autores", autores);
        System.out.print(autores);
        return "autores/index";
    }



    @GetMapping("/{id}")
    String novo(Model model, @PathVariable Long id) {
        Autor autores = rest.getForObject(Constants.URL_API + "/users/" + id, Autor.class);
       
        String name = autores.getName();
        
        String email = autores.Email();
        
        String username = autores.UserName();
        String phone = autores.Phone();
                  
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("username", username);
        model.addAttribute("telefone", phone);
        
        return "autores/form";
    }



}
