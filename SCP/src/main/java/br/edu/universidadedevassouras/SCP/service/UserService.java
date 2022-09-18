package br.edu.universidadedevassouras.SCP.service;


import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
        //trocar pelo banco de dados
        return new User("admin",
                "$2a$12$quBEvrqR/VUAmQZfpuWLAe.sppOHLHQLkHILlbt0Uvs2Xrpae4rWy"
                ,new ArrayList<>());
    }
}