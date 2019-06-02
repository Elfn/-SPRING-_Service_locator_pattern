package com.pattern.service.locator.app.implementations;

import com.opencsv.CSVReader;
import com.pattern.service.locator.app.file.structure.ContentType;
import com.pattern.service.locator.app.interfaces.Parser;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Component(ContentType.TypeConstants.CSV_PARSER)
public class CSVParser implements Parser {
    @Override
    public List parse() throws IOException {

        Reader r = new FileReader("Path");
        CSVReader csvReader = new CSVReader(r);
        List<String[]> list = new ArrayList<>();
        list = csvReader.readAll();
        r.close();
        csvReader.close();
        return list;
    }


}
