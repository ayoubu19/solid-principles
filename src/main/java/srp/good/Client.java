package srp.good;

import srp.good.modals.User;
import srp.good.services.abstractions.IEmailService;
import srp.good.services.abstractions.IUserService;
import srp.good.services.implementations.MailService;
import srp.good.services.implementations.UserService;

public class Client {
    public static void main(String[] args) {
       IEmailService emailService = new MailService();
       IUserService userService = new UserService(emailService);
       User user = new User();
       userService.registerUser(user);
    }
}
