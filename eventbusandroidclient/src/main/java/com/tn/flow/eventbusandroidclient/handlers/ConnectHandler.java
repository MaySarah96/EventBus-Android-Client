package com.tn.flow.eventbusandroidclient.handlers;

/**
 * Created by abdlquadri on 12/20/15.
 */
public interface ConnectHandler {
  public void onConnect(boolean isConnected);
  public void onDisConnect(Throwable cause);
}
