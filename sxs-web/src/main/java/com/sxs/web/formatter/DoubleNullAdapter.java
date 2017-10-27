package com.sxs.web.formatter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by hang on 2017/9/28 0028.
 */
public class DoubleNullAdapter extends TypeAdapter<Double> {

    private DecimalFormat df = new DecimalFormat("#.00");
    private NumberFormat nf = NumberFormat.getInstance();

    @Override
    public Double read(JsonReader reader) throws IOException {
        return reader.nextDouble();
    }

    @Override
    public void write(JsonWriter writer, Double value) throws IOException {
        // TODO Auto-generated method stub
        if (value == null || value.intValue() == 0) {
            writer.value("");
            return;
        }
        writer.value(nf.format(value));
    }
}
