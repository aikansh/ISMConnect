package com.ismconnect.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ismconnect.dal.data.UserDetail;
import com.ismconnect.dal.data.UserDetail.Role;
import com.ismconnect.dal.repo.UserRepository;
import com.ismconnect.dal.repo.UserRepositoryImpl;
import com.ismconnect.util.SignupConstants;

/**
 * @author aikanshg
 *
 */
@Controller
public class SignupController {

    UserRepository userRepo = new UserRepositoryImpl();
    final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @RequestMapping(value = "/saveuser", method = RequestMethod.POST)
    public ModelAndView saveUser(final HttpServletRequest request) {
        final ModelAndView model = new ModelAndView();
        model.setViewName("successsignup");
        final String password = passwordEncoder.encode(request.getParameter(SignupConstants.PASSWORD));
        final UserDetail userDetail = UserDetail.builder().fullName(request.getParameter(SignupConstants.FULL_NAME))
                .email(request.getParameter(SignupConstants.EMAIL)).password(password)
                .batch(request.getParameter(SignupConstants.BATCH))
                .phone(request.getParameter(SignupConstants.PHONE_NUMBER)).id(Double.toString(Math.random()))
                .role(Role.AlUMNUS.toString()).build();
        userRepo.saveUser(userDetail);
        return model;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView signup() {
        final ModelAndView model = new ModelAndView();
        model.setViewName("signup");
        return model;
    }
}
