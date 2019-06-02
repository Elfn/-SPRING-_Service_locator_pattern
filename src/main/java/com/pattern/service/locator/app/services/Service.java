package com.pattern.service.locator.app.services;

import com.pattern.service.locator.app.file.structure.ContentType;
import com.pattern.service.locator.app.interfaces.Parser;
import com.pattern.service.locator.app.interfaces.ParserFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public class Service {

    //We removed that code to make it more dynamic and less unwieldy when we want to add new contentType
    //Such that service will not be responsible to lookup a parser by using "switch case" statement
   /* private Parser jsonParser, csvParser;


    public Service(Parser jsonParser, Parser csvParser) {
        this.jsonParser = jsonParser;
        this.csvParser = csvParser;
    }

    public List getAll(ContentType contentType) {


        switch (contentType) {

            case CSV:
                return csvParser.parse(reader);

            case JSON:
                return jsonParser.parse(reader);

        }

        return null;
    }*/

    private ParserFactory parserFactory;
    @Autowired
    public Service(ParserFactory parserFactory) {
        this.parserFactory = parserFactory;
    }
    public List getAll(ContentType contentType) throws IOException {


        return parserFactory
                .getParser(contentType)    // gets the desired bean by content type
                .parse();
    }
}
