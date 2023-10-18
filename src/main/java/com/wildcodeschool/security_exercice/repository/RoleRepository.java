package com.wildcodeschool.security_exercice.repository;

import com.wildcodeschool.security_exercice.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
