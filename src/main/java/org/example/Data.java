package org.example;

import java.util.List;

public class Data extends Record{
  List<String> data;

  public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Data{" +
            "data=" + data +
            '}';
  }

  public String getDataByIndex(int index) {
    return data.get(index);
  }
}
