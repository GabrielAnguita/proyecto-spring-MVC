package cl.ganguita.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/product")
public class ProductController {
    
    @GetMapping
    public String home(ModelMap modelo) {
       
        return "product";
    }

}