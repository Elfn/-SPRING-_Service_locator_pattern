package com.pattern.service.locator.app.implementations;

import com.pattern.service.locator.app.file.structure.ContentType;
import com.pattern.service.locator.app.interfaces.Parser;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

@Component(ContentType.TypeConstants.XML_PARSER)
public class XMLParser implements Parser {
    @Override
    public List parse() {
        return null;
    }
}
