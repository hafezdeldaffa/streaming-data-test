package org.example;

public class Date extends Record{
  protected String date;

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Date{" +
            "date='" + date + '\'' +
            '}';
  }
}
