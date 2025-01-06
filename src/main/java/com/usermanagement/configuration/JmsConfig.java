package com.usermanagement.configuration;

import jakarta.jms.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms    // Enable JMS support  (java message servies)
public class JmsConfig {

    @Bean
    public DefaultJmsListenerContainerFactory jsmListenserContainerFactory(
            ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory factory=
                new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrency("1-5");
        return factory;

    }

}
