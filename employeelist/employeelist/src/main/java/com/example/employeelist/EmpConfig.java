package com.example.employeelist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class EmpConfig {
       //@Value("${spring.database.url}")
       //String url;
       //@Value("${spring.database.username}")
       //String username;
       //@Value("${spring.database.password}")
       //String password;

        @Bean
        public EmpModel empmodelobj()  {
           return new EmpModel();
        }
       // @Bean
        //public Connection connection() throws SQLException {
          //  Connection con=DriverManager.getConnection(url,username,password);

           // return con;
        }





