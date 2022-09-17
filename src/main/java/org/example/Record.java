package org.example;

import java.util.List;

public class Record extends StreamData {
  protected Header header;
  protected Date date;
  protected SendingTime sendingTime;
  protected SequenceNumber sequenceNumber;
  protected RecordType recordType;

  protected Data data;
  protected Trailer trailer;

  public Record() {
  }

  public Record(Header header, Date date, SendingTime sendingTime, SequenceNumber sequenceNumber, RecordType recordType, Data data, Trailer trailer) {
    this.header = header;
    this.date = date;
    this.sendingTime = sendingTime;
    this.sequenceNumber = sequenceNumber;
    this.recordType = recordType;
    this.data = data;
    this.trailer = trailer;
  }

  @Override
  public String toString() {
    return "Record{" +
            "header='" + header + '\'' +
            ", date=" + date +
            ", sendingTime='" + sendingTime + '\'' +
            ", sequenceNumber='" + sequenceNumber + '\'' +
            ", recordType=" + recordType +
            ", data=" + data +
            ", trailer='" + trailer + '\'' +
            '}';
  }


  @Override
  String processData(Record record) {
    return "Processing " + record + " data!";
  }
}

