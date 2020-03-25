package com.tn.flow.eventbusandroidclient.senders;


import com.tn.flow.eventbusandroidclient.handlers.Handler;

/**
 * Created by abdlquadri on 12/20/15.
 */
public interface ReplySender {
  void send(String replyMessage);

  void send(String replyMessage, String headers);

  void send(String replyMessage, String headers, Handler handler);
}
