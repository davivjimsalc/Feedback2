package org.ejemplosclases.smga.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisherUtil {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent(Object event) {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }
        LoggingUtil.logInfo("Publishing event: " + event.getClass().getSimpleName());
        eventPublisher.publishEvent(event);
    }

}

