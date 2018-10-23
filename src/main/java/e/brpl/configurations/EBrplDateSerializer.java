package e.brpl.configurations;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import e.brpl.utils.EBrpl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



@SuppressWarnings("unused")
public class EBrplDateSerializer extends JsonSerializer<Date> {


    @Override
    public void serialize(Date o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat(EBrpl.DATE_PATTERN);
        String formattedDate = formatter.format(o);
        jsonGenerator.writeString(formattedDate);
    }


}
