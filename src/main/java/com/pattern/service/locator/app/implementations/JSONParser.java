package com.pattern.service.locator.app.implementations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pattern.service.locator.app.file.structure.ContentType;
import com.pattern.service.locator.app.interfaces.Parser;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
@Component(ContentType.TypeConstants.JSON_PARSER)
public class JSONParser implements Parser {


    @Override
    public List parse() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        List<String > list = objectMapper.readValue("jsonFile",objectMapper.getTypeFactory().constructCollectionType(List.class,String.class));

        return list;
    }
}
