package com.test.controller;

import com.test.entity.Person;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping(path = "/aa", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String getList(Model model) {
        logger.info("---getList()---");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("小王", 12, "西安"));
        persons.add(new Person("小李", 12, "西安"));
        persons.add(new Person("小松", 13, "西安"));
        persons.add(new Person("小王八", 15, "西安"));
        System.out.println(persons);
        model.addAttribute("persons", persons);
        return "list";
    }

    @RequestMapping(path = "/getPerson", method = RequestMethod.GET)
    public String getPersoById(@RequestParam(name = "id") long id) {
        System.out.println("id : " + id);
        return "home";
    }

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(path = {"/dealRegister"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String registerSuccess(@Valid Person person, Errors errors) {
        if (errors.hasErrors()) {
            return "register";
        }
        System.out.println(person);
        return "success";
    }
    @RequestMapping(path = "/springTag", method = {RequestMethod.GET, RequestMethod.POST})
    public String getSpringReg(Model model) {
        Person person = new Person();
        person.setName("哇哈哈00");
        model.addAttribute(person);
        return "springTag";
    }

    @RequestMapping(path = {"/dealReg"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String registSpring(@Valid Person person, Errors errors) {
        if (errors.hasErrors()) {
            return "springTag";
        }
        System.out.println(person);
        return "success";
    }
}
