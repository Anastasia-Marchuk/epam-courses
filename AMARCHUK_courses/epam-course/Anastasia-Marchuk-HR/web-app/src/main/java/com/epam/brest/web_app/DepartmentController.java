package com.epam.brest.web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {

    @GetMapping(value="/departments")
    public String departments(Model model){

        return "departments";
    }

}




