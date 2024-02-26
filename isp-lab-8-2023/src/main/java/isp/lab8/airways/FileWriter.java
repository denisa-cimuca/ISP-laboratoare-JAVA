package isp.lab8.airways;

import com.fasterxml.jackson.core.JsonGenerator;

import java.io.DataOutput;
import java.io.File;

public class FileWriter extends JsonGenerator implements DataOutput {
    public FileWriter ( File file ) {
        super( );
    }
}
