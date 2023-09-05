package com.AlbersSoftware.Contentcreatorcalendar.controller;

import com.AlbersSoftware.Contentcreatorcalendar.configs.ContentCalendarProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {

    private final ContentCalendarProperties properties;

    public MainController(ContentCalendarProperties properties) {
        this.properties = properties;
    }


    @GetMapping("/")
    public ContentCalendarProperties home() {
        return properties;
    }

}

