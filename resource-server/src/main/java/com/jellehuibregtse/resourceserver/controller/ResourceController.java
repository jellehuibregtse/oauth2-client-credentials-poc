package com.jellehuibregtse.resourceserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The controller for the test resource.
 *
 * @author Jelle Huibregtse
 */
@RestController
public class ResourceController {

    /**
     * Simply returns a message if the client is authorized.
     *
     * @return a string of "Hello World".
     */
    @RequestMapping("/test")
    public String test() {
        return "Hello World";
    }
}