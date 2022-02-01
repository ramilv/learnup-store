package shop.learnup.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import shop.learnup.shop.jms.template.JmsTemplateProducerService;

@Configuration
public class JmsConfig {

    /*@Bean
    public JmsTemplateConsumerService jmsTemplateConsumerService(
            JmsTemplate jmsTemplate,
            @Value("${spring.activemq.object-queue-name}") String targetQueueName
    ) {
        return new JmsTemplateConsumerService(jmsTemplate, targetQueueName);
    }*/

    @Bean
    public JmsTemplateProducerService jmsTemplateProducerService(
            JmsTemplate jmsTemplate,
            @Value("${spring.activemq.object-queue-name}") String targetQueueName
    ) {
        return new JmsTemplateProducerService(jmsTemplate, targetQueueName);
    }
}
