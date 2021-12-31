package srp.good.services.implementations;

import srp.good.modals.User;
import srp.good.services.abstractions.IEmailService;
import srp.good.services.abstractions.IUserService;

public class UserService implements IUserService {

    IEmailService mailService;

    public UserService(IEmailService mailService) {
        this.mailService = mailService;
    }

    @Override
    public void registerUser(User user) {
      //some service logic
        System.out.println("sevrice logic related to registration of user");

      //notify user by mail
        mailService.sendMail();
    }

}