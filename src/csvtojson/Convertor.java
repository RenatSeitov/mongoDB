package csvtojson;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Convertor {

    private CsvToBean csv;
    private CSVReader csvReader;
    private ColumnPositionMappingStrategy columnPositionMappingStrategy;

    public void convert() throws IOException {
        columnPositionMappingStrategy = new ColumnPositionMappingStrategy();
        columnPositionMappingStrategy.setType(CSVParams.class);
        String[] columns = new String[] { "URL", "IPClient", "timestamp", "timeSpend" };
        columnPositionMappingStrategy.setColumnMapping(columns);

        csv = new CsvToBean();

        csvReader = new CSVReader((new FileReader("C:/Different/Development/RealLabs/CSVtoJSONUtility/server_log.csv")), ',' , ' ' , 2);

        List list = csv.parse(columnPositionMappingStrategy, csvReader);
        String json = new Gson().toJson(list);
        System.out.println(json);
        FileUtils.writeStringToFile(new File("C:/Different/Development/RealLabs/CSVtoJSONUtility/server_log.json"), json);
    }

}
