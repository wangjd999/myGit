package com.pro.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/11/15 15:07
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "t_user")
public class User implements UserDetails {
    private String id;
    private String username;
    private String password;
    private String name;
    private String sex;
    private LocalDateTime createDate;
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
