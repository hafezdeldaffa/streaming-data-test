package org.example;

public class Trailer extends Record{
  private String trailer;

  public String getTrailer() {
    return trailer;
  }

  public void setTrailer(String trailer) {
    this.trailer = trailer;
  }

  @Override
  public String toString() {
    return "Trailer{" +
            "trailer='" + trailer + '\'' +
            '}';
  }
}
