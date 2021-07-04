package com.atguigu.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FormTestController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }
}
