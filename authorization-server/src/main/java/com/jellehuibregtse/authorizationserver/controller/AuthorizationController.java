package com.jellehuibregtse.authorizationserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * The Authorization controller used by the resource-server to validate the user.
 *
 * @author Jelle Huibregtse
 */
@RestController
public class AuthorizationController {

    @RequestMapping("/validate-user")
    public Principal user(Principal user) {
        return user;
    }
}
