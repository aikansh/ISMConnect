package com.ismconnect.dal.repo;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.googlecode.objectify.ObjectifyService;
import com.ismconnect.dal.data.UserDetail;

public class UserRepositoryImpl implements UserRepository {

    public UserRepositoryImpl() {
        ObjectifyService.register(UserDetail.class);
    }

    @Override
    public UserDetail findUserByEmail(final String email) throws UsernameNotFoundException {
        final UserDetail user = ObjectifyService.ofy().load().type(UserDetail.class).filter("email", email).first()
                .now();
        if (user == null) {
            throw new UsernameNotFoundException("No user found with username: " + email);
        }
        final UserDetail userDetail = UserDetail.builder().fullName(user.getFullName()).id(user.getId())
                .email(user.getEmail()).password(user.getPassword()).role(user.getRole()).batch(user.getBatch())
                .build();

        return userDetail;
    }

    @Override
    public void saveUser(final UserDetail userDetail) {
        final String email = userDetail.getEmail();
        try {
            findUserByEmail(email);
        } catch (final UsernameNotFoundException e) {
            ObjectifyService.ofy().save().entity(userDetail).now();
            return;
        }
        throw new IllegalArgumentException();
    }
}
