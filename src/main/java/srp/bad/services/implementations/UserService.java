package srp.bad.services.implementations;

import srp.bad.modals.User;
import srp.bad.services.abstractions.IUserService;

public class UserService implements IUserService {

    @Override
    public void registerUser(User user) {
      //some service logic
        System.out.println("sevrice logic related to registration of user");
      //notify user by mail
        this.sendMail();
    }


    private void sendMail(){
        System.out.println("logic for sending mail coded inside usersevice");
    }

}