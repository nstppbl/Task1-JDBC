package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.testConnection();
        // Выбираем, использовать ли Hibernate или JDBC (true для Hibernate, false для JDBC)
        UserService userService = new UserServiceImpl(false);
        userService.createUsersTable();
        userService.saveUser("Yerzhan", "Khabulov", (byte) 34);
        userService.saveUser("Leonid", "Martov", (byte) 27);
        userService.saveUser("Adil", "Kalzhigitov", (byte) 25);
        userService.saveUser("Yernur", "Nurtusov", (byte) 25);
        userService.getAllUsers();
//        userService.removeUserById(3);
//        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
