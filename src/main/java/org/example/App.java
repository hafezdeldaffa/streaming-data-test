package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hafezd El Daffa
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> listData = new ArrayList<>();
        listData.add("AALI");
        listData.add("Astra Agro Lestari Tbk.");
        listData.add("0");
        listData.add("ORDI");
        listData.add("D232");
        listData.add("00000001550.00");

        // creating the header object
        Header header = new Header();
        header.setHeader("IDX");

        // creating the date object
        Date date = new Date();
        date.setDate("20220621");

        // creating the sendingTime object
        SendingTime sendingTime = new SendingTime();
        sendingTime.setSendingTime("080503");

        // creating the sequenceNumber object
        SequenceNumber sequenceNumber = new SequenceNumber();
        sequenceNumber.setSequenceNumber(00000120);

        // creating recordType object
        RecordType recordType = new RecordType();
        recordType.setRecordType(3);

        // creating data object
        Data data = new Data();
        data.setData(listData);

        // creating trailer object
        Trailer trailer = new Trailer();
        trailer.setTrailer("(CR)(LF)");

        // creating record object
        Record record = new Record(header, date, sendingTime, sequenceNumber, recordType, data, trailer );

        // getting the record object
        System.out.println(record);

        // getting the header data
        System.out.println(record.header.getHeader());

        // getting the stocks name data
        System.out.println(record.data.getDataByIndex(1));

        // getting the processData method
        System.out.println(record.processData(record));
    }
}
