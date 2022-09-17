package org.example;

public class RecordType extends Record {
  private int recordType;

  public int getRecordType() {
    return recordType;
  }

  public void setRecordType(int recordType) {
    this.recordType = recordType;
  }

  @Override
  public String toString() {
    return "RecordType{" +
            "recordType=" + recordType +
            '}';
  }
}
