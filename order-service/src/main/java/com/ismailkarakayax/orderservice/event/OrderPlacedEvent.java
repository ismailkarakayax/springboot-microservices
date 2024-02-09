package com.ismailkarakayax.orderservice.event;

import org.springframework.context.ApplicationEvent;

public class OrderPlacedEvent extends ApplicationEvent {
    public String orderNumber;

    public OrderPlacedEvent(Object source, String orderNumber) {
        super(source);
        this.orderNumber=orderNumber;
    }
    public OrderPlacedEvent(String orderNumber) {
        super(orderNumber);
        this.orderNumber=orderNumber;
    }

}
