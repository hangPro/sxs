package com.sxs.web.formatter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by hang on 2017/9/28 0028.
 */
public class BigDecimalNullAdapter extends TypeAdapter<BigDecimal> {

    @Override
    public BigDecimal read(JsonReader reader) throws IOException {
        System.out.println(reader);
        return null;
    }

    @Override
    public void write(JsonWriter writer, BigDecimal value) throws IOException {
        // TODO Auto-generated method stub
        if (value == null || value.compareTo(BigDecimal.ZERO) == 0) {
            writer.value(0);
            return;
        }
        writer.value(value.setScale(2,BigDecimal.ROUND_HALF_UP));
    }
}
