/**
 *
 */
package com.ismconnect.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ismconnect.dal.data.UserDetail;
import com.ismconnect.dal.repo.UserRepository;
import com.ismconnect.dal.repo.UserRepositoryImpl;
import com.ismconnect.util.SignupConstants;

/**
 * @author aikanshg
 *
 */
@Controller
public class LoginController {
    final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    UserRepository userRepo = new UserRepositoryImpl();

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public String authenticateUser(final HttpServletRequest request) {
        final String email = request.getParameter(SignupConstants.EMAIL);
        UserDetail userDetail = null;
        userDetail = userRepo.findUserByEmail(email);
        final Boolean passwordMatch = passwordEncoder.matches(request.getParameter(SignupConstants.PASSWORD),
                userDetail.getPassword());

        if (passwordMatch) {
            return "welcome";
        }
        throw new UsernameNotFoundException("Password not matched.Try again");
        // TODO: Add errors
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "homepage";
    }
}