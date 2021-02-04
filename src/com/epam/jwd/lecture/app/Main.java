package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.model.BookingRole;
import com.epam.jwd.lecture.model.BookingUser;
import com.epam.jwd.lecture.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final String SELECT_SQL = "select u.id as id, u.u_login as login, u.u_pass as password, u.u_name as name, r.role_name as role from b_user u join u_role r on r.id = u.role_id";

    public static void main(String[] args) {
//        registerDrivers();
        try (final Connection conn = ConnectionPool.INSTANCE.retrieveConnection();
             final Statement statement = conn.createStatement();
             final ResultSet resultSet = statement.executeQuery(SELECT_SQL)) {
            while (resultSet.next()) {
                final BookingUser user = new BookingUser(resultSet.getInt("id"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resultSet.getString("name"),
                        BookingRole.of(resultSet.getString("role")));
                System.out.println("user read successfully");
                System.out.println(user);
            }
        } catch (SQLException e) {
            System.out.println("user read unsuccessfully");
            e.printStackTrace();
        }
//        deregisterDrivers();
    }

//    private static void registerDrivers() {
//        System.out.println("registering another drivers");
//        try {
//            DriverManager.registerDriver(DriverManager.getDriver("jdbc:mysql://localhost:1234/cafe"));
//            System.out.println("registration successful");
//        } catch (SQLException e) {
//            System.out.println("deregistering successful");
//            e.printStackTrace();
//        }
//    }

//    private static void deregisterDrivers() {
//        Enumeration<java.sql.Driver> drivers = DriverManager.getDrivers();
//        while (drivers.hasMoreElements()) {
//            try {
//                DriverManager.deregisterDriver(drivers.nextElement());
//            } catch (SQLException e) {
//                System.out.println("deregistration unsuccessful");
//                e.printStackTrace();
//            }
//        }
//    }
}
