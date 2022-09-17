package org.example;

public class SequenceNumber extends Record{
  protected Integer sequenceNumber;

  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  @Override
  public String toString() {
    return "SequenceNumber{" +
            "sequenceNumber=" + sequenceNumber +
            '}';
  }
}
