package com.project.MainteX.Configuration;

import com.project.MainteX.Controller.UserController;
import com.project.MainteX.Repository.UserRepository;
import com.project.MainteX.Service.User.UserAdminService;
import com.project.MainteX.Service.User.UserAdminServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class AppConfig {

    //Metodo para saltar el login de Swagger
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.httpBasic().disable();
        return http.build();
    }

    @Bean
    public UserController getUserController(UserAdminService userAdminService){
        return new UserController(userAdminService);
    }

    @Bean
    public UserAdminService getUserAdminService(UserRepository userRepository) {
        return new UserAdminServiceImpl(userRepository);
    }
}
