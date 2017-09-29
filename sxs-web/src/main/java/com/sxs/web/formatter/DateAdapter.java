package com.sxs.web.formatter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by hang on 2017/9/28 0028.
 */
public class DateAdapter extends TypeAdapter<Date> {

    @Override
    public Date read(JsonReader jsonReader) throws IOException {
        return null;
    }

    @Override
    public void write(JsonWriter writer, Date value) throws IOException {
        // TODO Auto-generated method stub
        if (value == null) {
            writer.value("");
            return;
        }
        writer.value(value.getTime());
    }
}
