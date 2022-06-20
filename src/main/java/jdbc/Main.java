package jdbc;

import jdbc.model.User;
import jdbc.service.UserService;
import jdbc.service.UserServiceImpl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static final User user1 = new User("Ivan", "Petrov", (byte) 30);
    private static final User user2 = new User("Petr", "Ivanov", (byte) 18);
    private static final User user3 = new User("John", "Smith", (byte) 46);
    private static final User user4 = new User("Harry", "Potter", (byte) 52);

    public static void main(String[] args) {
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.saveUser(user1.getName(), user1.getLastName(), (byte) user1.getAge());

        userService.saveUser(user2.getName(), user2.getLastName(), (byte) user2.getAge());

        userService.saveUser(user3.getName(), user3.getLastName(), (byte) user3.getAge());

        userService.saveUser(user4.getName(), user4.getLastName(), (byte) user4.getAge());
        userService.getAllUsers();

        userService.cleanUsersTable();

    }
    }
