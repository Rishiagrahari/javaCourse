package com.cg.DemoSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.DemoSecurity.dto.User;

public interface UserRepository extends JpaRepository<User,Long> {
public User findByUsername(String username);
}
