package shop.learnup.shop.jms.template;

import org.apache.activemq.command.ActiveMQObjectMessage;
import org.springframework.jms.core.JmsTemplate;
import shop.learnup.shop.domain.messages.StoreMessageBody;

import javax.annotation.PostConstruct;
import javax.jms.*;

public class JmsTemplateProducerService {

    private JmsTemplate jmsTemplate;
    private String targetQueueName;

    public JmsTemplateProducerService(JmsTemplate jmsTemplate, String targetQueueName) {
        this.jmsTemplate = jmsTemplate;
        this.targetQueueName = targetQueueName;
    }

    @PostConstruct
    public void publishProcess() {
        new Thread(() -> {
            while (true) {
                jmsTemplate.send(targetQueueName, session -> {
                    final ObjectMessage msg = new ActiveMQObjectMessage();
                    int msgText = (int) (Math.random() * 1000);
                    msg.setObject(new StoreMessageBody(msgText, targetQueueName));
                    System.out.println(" -> sent: " + msgText);
                    return msg;
                });

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
