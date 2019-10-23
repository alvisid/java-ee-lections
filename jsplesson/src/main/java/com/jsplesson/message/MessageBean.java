package com.jsplesson.message;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
//@ManagedBean(name = "messageBean")
@RequestScoped
public class MessageBean {
    //    @ManagedProperty(value = "#{message}")
    @Inject
    private Message message;

    public MessageBean() {
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
