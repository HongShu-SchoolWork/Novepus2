package com.project.novepus.controller;

import com.project.novepus.model.Greeting;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @RequestMapping("/")
    public String root(Principal principal)
    {
        return "successful! " + principal.getName();
    }

    @RequestMapping("/account")
    public String getUsername() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Map<String, Object> attributes = ((DefaultOidcUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getAttributes();
        if (attributes.containsKey("preferred_username")) {
            return (String) attributes.get("preferred_username");
        }else return "Null";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/hashMap")
    public Map<String, Object> hashMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "xxx");
        map.put("age", 20);
        return map;
    }


}