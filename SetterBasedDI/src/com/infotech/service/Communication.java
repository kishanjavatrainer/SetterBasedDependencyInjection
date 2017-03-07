package com.infotech.service;

import com.infotech.message.Messaging;

public class Communication {

	private Messaging messaging;
	
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}
	
	public void communicate(){
		messaging.sendMessage();
	}
}
