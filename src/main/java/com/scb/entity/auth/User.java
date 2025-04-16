package com.scb.entity.auth;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scb.entity.AbstractEntity;
import com.scb.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AbstractEntity<Long>  implements UserDetails {

    @Column(name = "user_name", unique = true, nullable = false)
    String userName;

    @JsonIgnore
    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "enabled")
     Boolean enabled;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
     Role role;




    /**
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    /**
     * @return
     */
    @Override
    public String getUsername() {
        return "";
    }

    /**
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return  true;
    }

    /**
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
