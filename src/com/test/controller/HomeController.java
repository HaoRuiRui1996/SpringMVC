package com.test.controller;

import com.test.entity.Person;
import org.apache.log4j.Logger;
<<<<<<< HEAD
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
=======
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
=======
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private Logger logger = Logger.getLogger(HomeController.class);
<<<<<<< HEAD
=======
    private static final String LOCATION = "Q:/upload/";
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f

    @RequestMapping(path = "/aa", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

<<<<<<< HEAD
    @RequestMapping(path = "/ist", method = RequestMethod.GET)
=======
    @RequestMapping(path = "/list", method = RequestMethod.GET)
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
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

<<<<<<< HEAD
    @RequestMapping(path = "dealRegister", method = {RequestMethod.GET, RequestMethod.POST})
    public String registerSuccess(@Valid Person person, Errors errors) {
        if (errors.hasErrors()) {
            return "register";
        }
=======
    @RequestMapping(path = {"/dealRegister"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String registerSuccess(@Valid Person person,
                                  Errors errors) {
        //@RequestParam("profilePicture") MultipartFile profilePicture,

        //@RequestPart("profilePicture") byte[] profilePicture,
        //将数据存在byte数组，若没有上传文件，数组是空的
        if (errors.hasErrors()) {
            return "register";
        }
        //person.setProfilePicture(profilePicture);
        MultipartFile file = person.getProfilePicture();
        System.out.println(file.getName());
        System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename());
            try {
            FileCopyUtils.copy(file.getBytes(),
                    new File(LOCATION + "/" + file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
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
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
        System.out.println(person);
        return "success";
    }
}
