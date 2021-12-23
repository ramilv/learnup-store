package shop.learnup.shop.notificators;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import shop.learnup.shop.services.Notificator;

@Service
@Profile("local")
public class ConsoleNotificator extends Notificator {

    public void send(String toAddress, String subject, String message) {
        System.out.println("Новое уведомление.");
        System.out.println("Получатель" + toAddress);
        System.out.println("Тема: " + subject);
        System.out.println("Сообщение: " + message);
    }
}
