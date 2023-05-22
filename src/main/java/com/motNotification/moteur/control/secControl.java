package com.motNotification.moteur.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;


    @Controller
    public class secControl {


        @GetMapping(path= "/login")
        public String login(){
            return "login";

        }

    }

