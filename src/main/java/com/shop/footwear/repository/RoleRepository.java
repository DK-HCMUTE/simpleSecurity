package com.shop.footwear.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.footwear.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

}
