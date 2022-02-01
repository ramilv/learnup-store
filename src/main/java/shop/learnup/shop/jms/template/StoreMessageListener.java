package shop.learnup.shop.jms.template;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import shop.learnup.shop.domain.messages.StoreMessageBody;

@Component
public class StoreMessageListener {

    @JmsListener(destination = "storeQueue")
    public void getObjectMessage(@Payload StoreMessageBody messageBody) {
        System.out.println(" <- received: " + messageBody.getNumber());
    }
}
