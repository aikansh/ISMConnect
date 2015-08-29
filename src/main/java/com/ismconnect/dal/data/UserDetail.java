/**
 *
 */
package com.ismconnect.dal.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * @author aikanshg
 *
 */
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDetail {

    public enum Role {
        AlUMNUS, STUDENT
    }
    public enum SocialMediaService {
        FACEBOOK, CUSTOM
    }
    @Id
    private String id;
    private String fullName;
    @Index
    private String email;
    private String password;
    private String batch;
    private String role;
    private String phone;
    private String socialServiceProvider;
}
