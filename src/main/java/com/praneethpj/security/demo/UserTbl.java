package com.praneethpj.security.demo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Table(name = "UserDetails")
public class UserTbl {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;

}
