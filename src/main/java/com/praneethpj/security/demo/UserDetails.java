package com.praneethpj.security.demo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class UserDetails {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;

}
