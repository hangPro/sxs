package com.sxs.web.formatter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Created by hang on 2017/9/28 0028.
 */
public class BigDecimalNullAdapter extends TypeAdapter<BigDecimal> {

    @Override
    public BigDecimal read(JsonReader reader) throws IOException {
        //System.out.println(reader);
        return null;
    }

    @Override
    public void write(JsonWriter writer, BigDecimal value) throws IOException {
        // TODO Auto-generated method stub
        if (value == null || value.compareTo(BigDecimal.ZERO) == 0) {
            writer.value("");
            return;
        }
        NumberFormat nf = NumberFormat.getInstance();
        writer.value(nf.format(value.setScale(2,BigDecimal.ROUND_HALF_UP)));
    }
}
