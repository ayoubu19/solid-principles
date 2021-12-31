package srp.bad;

import srp.bad.modals.User;
import srp.bad.services.abstractions.IUserService;
import srp.bad.services.implementations.UserService;

public class Client {
    public static void main(String[] args) {
       IUserService userService = new UserService();
       User user = new User();
       userService.registerUser(user);
    }
}
