package com.content_calendar.content.calendar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContentCalendarApplication {

    public static void main(String[] args) {   
        String url="jdbc:mysql://localhost:3306/content-calendar";
        String user= "root";
        String pass= "rfy2rgab";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected succesfully.");
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        SpringApplication.run(ContentCalendarApplication.class, args);
        }

    }


