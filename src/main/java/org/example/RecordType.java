package org.example;

public class RecordType extends Record {
  protected int recordType;

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
