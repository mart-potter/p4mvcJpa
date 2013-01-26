package p4.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import p4.dao.PersonDao;

@Controller
public class TreeController {

    @Resource
    private PersonDao personDao;

    @RequestMapping(value = "/tree")
    public String personTree(ModelMap model) {
        return "tree";
    }

}