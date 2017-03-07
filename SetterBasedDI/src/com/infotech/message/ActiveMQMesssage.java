package com.infotech.message;

public class ActiveMQMesssage implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending messsage Via Active MQ..");
	}
}
