package com.ismconnect.dal.repo;

import com.ismconnect.dal.data.UserDetail;

/**
 * @author aikanshg
 *
 */

public interface UserRepository {

    UserDetail findUserByEmail(String email);

    void saveUser(final UserDetail userDetail);

}