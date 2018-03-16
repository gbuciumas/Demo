package com.itin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItinManagerController {
	
	@RequestMapping("/search")
    public String searchItin(@RequestParam(value="itin", defaultValue="1234") String itin) {
        return "Hello world" + itin;
    }

}
