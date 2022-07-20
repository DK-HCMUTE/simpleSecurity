package com.shop.footwear.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shop.footwear.entity.Role;
import com.shop.footwear.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

	@Query("SELECT r FROM Role r INNER JOIN r.users u WHERE u = ?1")
	Role findRoleByUser(User user);


}
