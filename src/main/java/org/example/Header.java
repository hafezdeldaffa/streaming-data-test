package org.example;

public class Header extends Record {
  protected String header;

  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  @Override
  public String toString() {
    return "Header{" +
            "header='" + header + '\'' +
            '}';
  }
}
