package com.wildcodeschool.security_exercice.service;

import com.wildcodeschool.security_exercice.entity.Role;
import com.wildcodeschool.security_exercice.entity.UserEntity;
import com.wildcodeschool.security_exercice.repository.RoleRepository;
import com.wildcodeschool.security_exercice.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Generator {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptEncoder;

    public Generator(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptEncoder = bCryptEncoder;
    }

    public void generateUserList(){

        Role admin = new Role("Admin");
        Role user = new Role("User");

        UserEntity userAdmin = new UserEntity(bCryptEncoder.encode("user1password"), "user1");
        UserEntity userUser = new UserEntity(bCryptEncoder.encode("adminpassword"), "admin");

        userAdmin.getRoles().add(admin);
        userUser.getRoles().add(user);

        List<UserEntity> users = new ArrayList<>();
        users.add(userUser);
        users.add(userAdmin);
        userRepository.saveAll(users);
    }


}
