package com.rudenko.knowledgeTesting.controllers;


import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @GetMapping("/greeting")//обрабатывет юрл адрес /greeting типа слушатель и когда видит выполняется метод greeting
    //если просто / то ето главная
    public String greeting( Model model) {//метод greeting
        model.addAttribute("name", "ANNA");//параметр model  по названию name = значение "ANNA"
        // будет передан в шаблон return "greeting";
        return "greeting";  //вызываем шалон под названием greeting
    }

}