package e.brpl.app.configurations;

import com.fasterxml.jackson.databind.JsonSerializer;
import e.brpl.app.utils.EBrpl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


@SuppressWarnings("unused")
public class EBrplDateTimeSerializer extends JsonSerializer<Date> {


    @Override
    public void serialize(Date date, com.fasterxml.jackson.core.JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.SerializerProvider serializerProvider) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat(EBrpl.DATE_TIME_PATTERN);
        String formattedDate = formatter.format(date);
        jsonGenerator.writeString(formattedDate);

    }
}
