package com.sxs.web.formatter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by hang on 2017/9/28 0028.
 */
public class NumberNullAdapter extends TypeAdapter<Number> {

    @Override
    public Number read(JsonReader reader) throws IOException {
        //System.out.println(reader);
        return null;
    }

    @Override
    public void write(JsonWriter writer, Number value) throws IOException {
        if (value == null) {
            writer.value("");
            return;
        }
        writer.value(value);
    }
}
