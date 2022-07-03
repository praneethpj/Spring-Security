package com.praneethpj.security.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserTbl,Long> {

    UserTbl findByUsername(String username);
}
