package srp.good.services.implementations;

import srp.good.services.abstractions.IEmailService;

public class MailService implements IEmailService {
    @Override
    public void sendMail() {
        System.out.println("sendMail logic separated");
    }
}
