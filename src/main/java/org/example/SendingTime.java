package org.example;

public class SendingTime extends Record{
  private String sendingTime;

  public String getSendingTime() {
    return sendingTime;
  }

  public void setSendingTime(String sendingTime) {
    this.sendingTime = sendingTime;
  }

  @Override
  public String toString() {
    return "SendingTime{" +
            "sendingTime='" + sendingTime + '\'' +
            '}';
  }
}
